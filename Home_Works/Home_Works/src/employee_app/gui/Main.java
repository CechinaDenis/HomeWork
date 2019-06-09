package employee_app.gui;

import employee_app.gui.employee_manager.Employee;
import employee_app.gui.employee_manager.Position;
import employee_app.gui.service.EmployeeService;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
 * @author Denis Cechina
 */
public class Main extends javax.swing.JFrame {

    private final int COLUMN = 0;

    private void loadEmployees() {
        try {
            ArrayList<Employee> all = EmployeeService.getAll();
            JOptionPane.showMessageDialog(null, "SQL Connection Established ");
            DefaultTableModel employeeListModel = (DefaultTableModel) Main.tblMain.getModel();
            for (Employee emp : all) {
                int employeeId = employeeListModel.getRowCount() + 1;
                employeeListModel.addRow(new Object[]{employeeId, emp.getName(),
                    emp.getSurname(), emp.getBirthDate(), emp.getCountry(),
                    emp.getCity(), emp.getStreet(), emp.getZipCode(),
                    emp.getPosition().getName()});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Connection Faild,\nPlease "
                    + "try one more time!!!");
        }
    }

    public static int addEmployee(Employee emp) {
        if (emp.isValid()) {
            int affectedRows = addEmployeeToList(emp);
            return affectedRows;
        } else {
            System.err.println("User didn't ENTER Employee ( * ) Fields!!!");
            return -3;
        }
    }

    private static int addEmployeeToList(Employee emp) {

        int affectedRows;

        try {
            affectedRows = EmployeeService.add(emp);
            if (affectedRows == 1) {
                DefaultTableModel employeeListModel = (DefaultTableModel) Main.tblMain.getModel();
                int rowRef = employeeListModel.getRowCount() + 1;
                employeeListModel.addRow(new Object[]{rowRef, emp.getName(),
                    emp.getSurname(), emp.getBirthDate(), emp.getCountry(),
                    emp.getCity(), emp.getStreet(), emp.getZipCode(),
                    emp.getPosition().toString()});
                return affectedRows;
            }

        } catch (SQLException ex) {
            System.err.println("ERROR Main.addEmployeeToList");
            return -2;
        }
        return affectedRows;
    }

    public static int editEmployee(int idEmployee, String newName,
            String newSurname, String newBirthDate, String newCountry,
            String newCity, String newStreet, String newZipCode,
            Position newPosition, int rowRef)
            throws SQLException {

        Employee emp = new Employee(newName, newSurname, newBirthDate,
                newCountry, newCity, newStreet, newZipCode, newPosition);
        emp.setId(idEmployee);
        emp.setRefRow(rowRef);
        if (emp.isValid()) {
            int affectedRows = EmployeeService.edit(emp);
            if (affectedRows == 1) {
                DefaultTableModel employeeListModel = (DefaultTableModel) Main.tblMain.getModel();
                employeeListModel.setValueAt(newName, rowRef - 1, 1);
                employeeListModel.setValueAt(newSurname, rowRef - 1, 2);
                employeeListModel.setValueAt(newBirthDate, rowRef - 1, 3);
                employeeListModel.setValueAt(newCountry, rowRef - 1, 4);
                employeeListModel.setValueAt(newCity, rowRef - 1, 5);
                employeeListModel.setValueAt(newStreet, rowRef - 1, 6);
                employeeListModel.setValueAt(newZipCode, rowRef - 1, 7);
                employeeListModel.setValueAt(newPosition, rowRef - 1, 8);
                return affectedRows;
            } else {
                return affectedRows;
            }
        } else {
            System.err.println("User didn't ENTER Employee ( * ) Fields!!!");
            return -3;
        }

    }

    private void editEmployeeTblRef(int rowRef) {

        DefaultTableModel employeeListModel = (DefaultTableModel) Main.tblMain.getModel();
        for (int i = rowRef - 1; i < employeeListModel.getRowCount(); i++) {
            employeeListModel.setValueAt(String.valueOf(rowRef++), i, COLUMN);
        }
    }

    private void showEmployees() {
        try {
            ArrayList<Employee> all = EmployeeService.getAll();
            for (Employee emp : all) {
                System.out.println(emp.toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void serialization(String filePath)
            throws SQLException, IOException, ParserConfigurationException,
            TransformerException {

        EmployeeService.serialization(filePath);
    }

    public static void deserialization(String filePath) throws IOException,
            ParserConfigurationException, SAXException {

        EmployeeService.deserialization(filePath);
    }

    public static String fileSave() {
        return EmployeeService.fileSave();
    }

    public static String fileOpen(String extension) {
        return EmployeeService.fileOpen(extension);
    }

    public Main() {
        initComponents();
        this.loadEmployees();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMain = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnEdite = new javax.swing.JButton();
        btnSerch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main");
        setResizable(false);

        tblMain.setAutoCreateRowSorter(true);
        tblMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Birth Date", "Country", "City", "Street", "ZIP Code", "Position"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMain);
        if (tblMain.getColumnModel().getColumnCount() > 0) {
            tblMain.getColumnModel().getColumn(0).setResizable(false);
            tblMain.getColumnModel().getColumn(0).setPreferredWidth(4);
            tblMain.getColumnModel().getColumn(7).setPreferredWidth(40);
        }

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdite.setText("Edite");
        btnEdite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditeActionPerformed(evt);
            }
        });

        btnSerch.setText("Serch");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdite, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSerch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdite, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSerch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditeActionPerformed

        int selectedRow = Main.tblMain.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel employeeListModel = (DefaultTableModel) Main.tblMain.getModel();
            Object name = employeeListModel.getValueAt(selectedRow, 1);
            Object surname = employeeListModel.getValueAt(selectedRow, 2);
            Object birthDate = employeeListModel.getValueAt(selectedRow, 3);
            Employee foundEmployee = EmployeeService.getByParams(name.toString(),
                    surname.toString(),
                    birthDate.toString());
            int refRow = Integer.parseInt(employeeListModel
                    .getValueAt(selectedRow, 0).toString());
            foundEmployee.setRefRow(refRow);
            Edit editWindow = new Edit(foundEmployee);
            editWindow.setVisible(true);
        }

    }//GEN-LAST:event_btnEditeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        Add add = new Add();
        add.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed

        showEmployees();
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int selectedRow = Main.tblMain.getSelectedRow();

        if (selectedRow != -1) {
            try {
                DefaultTableModel employeeListModel = (DefaultTableModel) Main.tblMain.getModel();

                Object value = employeeListModel.getValueAt(selectedRow, 0);
                Object name = employeeListModel.getValueAt(selectedRow, 1);
                Object surname = employeeListModel.getValueAt(selectedRow, 2);
                Object birthDate = employeeListModel.getValueAt(selectedRow, 3);

                employeeListModel.removeRow(selectedRow);
                Integer rowRef = Integer.parseInt(value.toString());
                editEmployeeTblRef(rowRef);
                int affectedRows = EmployeeService.remove(name.toString(),
                        surname.toString(),
                        birthDate.toString());
                if (affectedRows == 1) {
                    JOptionPane.showMessageDialog(null, "Employee successfully "
                            + "deleted");
                } else {
                    JOptionPane.showMessageDialog(null, "Something went wrong!!!\n"
                            + "Please try one more time!!!");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong!!!\n"
                        + "Please try one more time!!!");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        Import imp = new Import();
        imp.setVisible(true);
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        Export export = new Export();
        export.setVisible(true);
    }//GEN-LAST:event_btnExportActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdite;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnSerch;
    private javax.swing.JButton btnShow;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tblMain;
    // End of variables declaration//GEN-END:variables
}
