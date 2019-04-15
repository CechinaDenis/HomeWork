package employee_app.gui.employee_manager;

import java.util.Objects;

/**
 * @author Denis Cechina
 */
public class Employee {

    private Integer refRow;
    private Integer id;
    private String name;
    private String surname;
    private String birthDate;
    private String country;
    private String city;
    private String street;
    private String zipCode;
    protected Position position;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, String birthDate) {
        this(name, surname);
        this.birthDate = birthDate;
    }

    public Employee(String name, String surname, String birthDate, String country) {
        this(name, surname, birthDate);
        this.country = country;
    }

    public Employee(String name, String surname, String birthDate, String country,
            String city) {
        this(name, surname, birthDate, country);
        this.city = city;
    }

    public Employee(String name, String surname, String birthDate, String country,
            String city, String street) {
        this(name, surname, birthDate, country, city);
        this.street = street;
    }

    public Employee(String name, String surname, String birthDate, String country,
            String city, String street, String zipCode) {
        this(name, surname, birthDate, country, city, street);
        this.zipCode = zipCode;
    }

    public Employee(String name, String surname, String birthDate, String country,
            String city, String street, String zipCode, Position position) {
        this(name, surname, birthDate, country, city, street, zipCode);
        this.position = position;
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
        return birthDate;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Position getPosition() {
        return position;
    }

    public Integer getRefRow() {
        return refRow;
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

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setRefRow(Integer refRow) {
        this.refRow = refRow;
    }

    public boolean isValid() {
        return !(this.name.isEmpty() || this.surname.isEmpty()
                || this.birthDate.isEmpty());
    }

    @Override
    public String toString() {
        return name + "," + surname + "," + birthDate + "," + country + ","
                + city + "," + street + "," + zipCode + "," + position.getName()
                + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.surname);
        hash = 89 * hash + Objects.hashCode(this.birthDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!(this.name.equalsIgnoreCase(other.name) && this.surname.equalsIgnoreCase(other.surname) && this.birthDate.equalsIgnoreCase(other.birthDate))) {
            return false;
        }
        return true;
    }
    
    
}
