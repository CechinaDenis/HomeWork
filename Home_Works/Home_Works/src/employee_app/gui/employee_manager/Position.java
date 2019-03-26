package employee_app.gui.employee_manager;

/**
 * @author Denis Cechina
 */
public enum Position {
    BookKeeper("Book Keeper"),
    HRManager("HR Manager"),
    Manager("Manager"),
    Programmer("Programmer"),
    Salesman("Salesman"),
    Technician("Technician");

    private String name;

    private Position(String name) {
        this.name = name;
    }

    public static Position getByPositionName(String positionName) {
        for (Position pos : Position.values()) {
            if (pos.name.equals(positionName)) {
                return pos;
            }
        }
        throw new IllegalArgumentException("something wrong");
    }
}
