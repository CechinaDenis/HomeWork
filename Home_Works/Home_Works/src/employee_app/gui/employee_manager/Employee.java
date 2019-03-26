package employee_app.gui.employee_manager;

/**
 * @author Denis Cechina
 */
public class Employee {

    private Integer id;
    private String name;
    private String surname;
    private String birthdate;
    private String country;
    private String city;
    private String Street;
    private String zipCode;
    protected Position position;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, String birthdate) {
        this(name, surname);
        this.birthdate = birthdate;
    }

    public Employee(String name, String surname, String birthdate, String country) {
        this(name, surname, birthdate);
        this.country = country;
    }

    public Employee(String name, String surname, String birthdate, String country,
            String city) {
        this(name, surname, birthdate, country);
        this.city = city;
    }

    public Employee(String name, String surname, String birthdate, String country,
            String city, String Street) {
        this(name, surname, birthdate, country, city);
        this.Street = Street;
    }

    public Employee(String name, String surname, String birthdate, String country,
            String city, String Street, String zipCode) {
        this(name, surname, birthdate, country, city, Street);
        this.zipCode = zipCode;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthDate() {
        return birthdate;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return Street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Position getPosition() {
        return position;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    
    public boolean isValid() {
        return !this.name.isEmpty();
    }

    @Override
    public String toString() {
        return "Employee{" + "ID=" + id + ", name=" + name + ", surname="
                + surname + ", birthdate=" + birthdate + ", country=" + country
                + ", city=" + city + ", Street=" + Street + ", zipCode="
                + zipCode + ", position=" + position + "}\n";
    }

}
