package employee_app.gui.service;

import employee_app.gui.employee_manager.Employee;
import employee_app.gui.employee_manager.Position;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Denis Cechina
 */
public class EmployeeDao {

    private static final String URL = "jdbc:postgresql://localhost:5432/testdb";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "admin";

    private static final String NAME = "name";
    private static final String SURNAME = "surname";
    private static final String BIRTH_DATE = "birth_date";
    private static final String COUNTRY = "country";
    private static final String CITY = "city";
    private static final String STREET = "street";
    private static final String ZIP_CODE = "zip_code";
    private static final String POSITION = "position";

    public EmployeeDao() {

    }

    private Connection connection()
            throws SQLException {
        System.out.println("Connected to postgresql server successfully.");
//        joptionalpane timeout 2 sec
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public ArrayList<Employee> getAll()
            throws SQLException {

        String sql = ("SELECT id, name, surname, birth_date, country, city, "
                + "street, zip_code, position  FROM app.employee;");
        try (
                Statement dbStatement = connection().createStatement();
                ResultSet rs = dbStatement.executeQuery(sql)) {
            ArrayList empList = new ArrayList<Employee>();
            while (rs.next()) {
                Employee emp = new Employee(
                        rs.getString(NAME),
                        rs.getString(SURNAME),
                        rs.getString(BIRTH_DATE),
                        rs.getString(COUNTRY),
                        rs.getString(CITY),
                        rs.getString(STREET),
                        rs.getString(ZIP_CODE),
                        Position.getByPositionName(rs.getString(POSITION)));
                emp.setId(rs.getInt("id"));
                empList.add(emp);
            }
            return empList;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to get all the employees"
                    + "in EmployeeDao 'getAll'");
            throw ex;
        }
    }

    public Employee getEmployee(String name, String surname, String birthDate) {
        String sql = "SELECT id, name, surname, birth_date, country, city, "
                + "street, zip_code, position FROM app.employee WHERE name=? "
                + "AND surname=? AND birth_date=?";
        try (Connection conn = connection();
                PreparedStatement prepStmt = conn.prepareStatement(sql)) {

            prepStmt.setString(1, name);
            prepStmt.setString(2, surname);
            prepStmt.setDate(3, Date.valueOf(birthDate));
            ResultSet rs = prepStmt.executeQuery();
            Employee emp = null;
            while (rs.next()) {
                emp = new Employee(
                        rs.getString(NAME),
                        rs.getString(SURNAME),
                        rs.getString(BIRTH_DATE),
                        rs.getString(COUNTRY),
                        rs.getString(CITY),
                        rs.getString(STREET),
                        rs.getString(ZIP_CODE),
                        Position.getByPositionName(rs.getString(POSITION)));
                emp.setId(rs.getInt("id"));
            }
            return emp;
        } catch (SQLException ex) {
            System.err.println("Error trying to get one employee");
        }
        return null;
    }

    public int duplicationCheck(Employee emp)
            throws SQLException {

        String sql = "SELECT count(*) FROM app.employee WHERE name=? AND "
                + "surname=? AND birth_date=?";
        try (Connection conn = connection();
                PreparedStatement dbStatement = conn.prepareStatement(sql)) {
            dbStatement.setString(1, emp.getName());
            dbStatement.setString(2, emp.getSurname());
            dbStatement.setDate(3, Date.valueOf(emp.getBirthDate()));

            
            int result = dbStatement.getre;//<STOPED HERE
            if (result > 0) {
                return 1;
            } else if (result == 0) {
                return 0;
            }
        } catch (SQLException ex) {
            System.err.println("ERROR WHEN TRYING TO FIND DUBLICATS");
            throw ex;
        }
        return -1;
    }

    public int add(Employee emp)
            throws SQLException {

        String sql = "INSERT INTO app.employee(name, surname, birth_date, "
                + "country, city, street, zip_code, position) VALUES (?, ?, ?, ?,"
                + " ?, ?, ?, ?)";
        int checkResult = duplicationCheck(emp);
        if (checkResult == 0) {

            try (Connection conn = connection();
                    PreparedStatement dbStatement = conn.prepareStatement(sql)) {

                dbStatement.setString(1, emp.getName());
                dbStatement.setString(2, emp.getSurname());
                dbStatement.setDate(3, Date.valueOf(emp.getBirthDate()));
                dbStatement.setString(4, emp.getCountry());
                dbStatement.setString(5, emp.getCity());
                dbStatement.setString(6, emp.getStreet());
                dbStatement.setString(7, emp.getZipCode());
                dbStatement.setString(8, emp.getPosition().getName());

                int affectedRows = dbStatement.executeUpdate();
                System.out.printf("Executed insert statement. Affected %d rows%n",
                        affectedRows);

                return affectedRows;
            } catch (SQLException ex) {
                System.err.println("Caught an error trying to insert the employee"
                        + "in EmployeeDao 'add'");
                throw ex;
            }
        }else if(checkResult == 1){
            return 0;
        }else{
            return -2;
        }
    }

    /*------------------------MULTIPLE ADD QUERY------------------------------------
    public int add(ArrayList<Employee> empList) throws SQLException {
        String insertSql = "INSERT INTO app.employee(name,surname,position) "
                + "VALUES (?,?,?)";
        try (Connection conn = connection();
                PreparedStatement dbStatement = conn.prepareStatement(insertSql)) {

            for (Employee emp : empList) {
                dbStatement.setString(1, emp.getName());
                dbStatement.setString(2, emp.getSurname());
                dbStatement.setString(3, emp.getPosition().getName());
                dbStatement.addBatch();
            }

            int affectedRows = dbStatement.executeUpdate();
            System.out.printf("Executed insert statement. Affected %d rows%n", 
                    affectedRows);
            
            return affectedRows;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to insert the employees");
            throw ex;
        }
    }
----------------------------------END-----------------------------------------*/
    public int edit(Employee emp)
            throws SQLException {

        String sql = "UPDATE app.employee SET name=?, surname=?, birth_date=?, "
                + "country=?, city=?, street=?, zip_code=?,position=? WHERE id=?";
        try (Connection conn = connection();
                PreparedStatement dbStatement = conn.prepareStatement(sql)) {

            dbStatement.setString(1, emp.getName());
            dbStatement.setString(2, emp.getSurname());
            dbStatement.setDate(3, Date.valueOf(emp.getBirthDate()));
            dbStatement.setString(4, emp.getCountry());
            dbStatement.setString(5, emp.getCity());
            dbStatement.setString(6, emp.getStreet());
            dbStatement.setString(7, emp.getZipCode());
            dbStatement.setString(8, emp.getPosition().getName());
            dbStatement.setInt(9, emp.getId());

            int affectedRows = dbStatement.executeUpdate();
            System.out.printf("Executed insert statement. Affected %d rows",
                    affectedRows);

            return affectedRows;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to insert the employees");
            throw ex;
        }
    }

    public int remove(String name, String surname, String birthDate)
            throws SQLException {

        String sql = "DELETE FROM app.employee WHERE name=? AND surname=? AND "
                + "birth_date=?";
        try (Connection conn = connection();
                PreparedStatement dbStatement = conn.prepareStatement(sql)) {
            dbStatement.setString(1, name);
            dbStatement.setString(2, surname);
            dbStatement.setDate(3, Date.valueOf(birthDate));
            int affectedRows = dbStatement.executeUpdate();
            System.out.printf("Executed delete statement. Affected %d rows%n",
                    affectedRows);

            return affectedRows;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to delete the employee");
            throw ex;
        }
    }

//    public static void serializeToPstgrSQL()
//            throws ClassNotFoundException, SQLException {
//
//        PreparedStatement stmt = getConnection()
//                .prepareCall("select name, surname, birth_date, country, city, "
//                        + "street, zip_code, position  from employee;");
//        ResultSet rs = stmt.executeQuery();
//        while (rs.next()) {
//
//            Object emp = rs.getObject("name");
//            System.out.println(emp);
//        }
//        for(int i = 2; rs.next(); i++){
//            System.out.println(rs.getArray(i));
//        }
//        while(rs.next()){
//            System.out.println(rs.getArray());
//        }
//    }
//
//    public static void deserializeFromPstgrSQL()
//            throws ClassNotFoundException, SQLException {
//
//        PreparedStatement stmt = getConnection()
//                .prepareCall("select * from employee;");
//        ResultSet rs = stmt.executeQuery();
//
//    }
}
