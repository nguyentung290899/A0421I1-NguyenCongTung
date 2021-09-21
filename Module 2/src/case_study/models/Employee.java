package case_study.models;

public class Employee extends Person {
    private int employeeCode;
    private final String[] degreeArray = {"Trung cap", "Cao dang", "Dai hoc", "Sau dai hoc"};
    private String degree;
    private final String[] positionArray = {"Le tan", "phuc vu", "chuyen vien", "giam sat", "quan ly", "giam đoc"};
    private String position;
    private float salary;

    public Employee() {
    }

    public Employee(int employeeCode, int degree, int position, float salary) {
        this.employeeCode = employeeCode;
        this.degree = degreeArray[degree];
        this.position = positionArray[position];
        this.salary = salary;
    }


    public Employee(String name, String dateOfBirth, String sex, int identityCardNumber, String telephoneNumber, String email, int employeeCode, int degree, int position, float salary) {
        super(name, dateOfBirth, sex, identityCardNumber, telephoneNumber, email);
        this.employeeCode = employeeCode;
        this.degree = degreeArray[degree];
        this.position = positionArray[position];
        this.salary = salary;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degreeArray[degree];
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = positionArray[position];
    }

    public String[] getDegreeArray() {
        return degreeArray;
    }

    public String[] getPositionArray() {
        return positionArray;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode=" + employeeCode +
                ", degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
