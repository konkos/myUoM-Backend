package gr.uom.myUoM.department;

public class DepartmentNotFound extends RuntimeException {
    public DepartmentNotFound() {
        super("Department Not Found");
    }
}
