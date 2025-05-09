package DefiningClasses.BankAccount.CompanyRoster;

public class Department {
    private String departmentName;
    private double departmentSalary;
    private static int departmentCount = 0;

    public Department(String departmentName, double departmentSalary){
        this.departmentName = departmentName;
        this.departmentSalary = departmentSalary;
    }

    public void addToDepartmentSalary(double salary){
        this.departmentSalary += salary;
    }
    public double getAverageDepartmentSalary(){
        double departmentSalary = getDepartmentSalary();
        return departmentSalary / Department.departmentCount;
    }
    public static void incrementDepartmentCount(){
        Department.departmentCount++;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public double getDepartmentSalary() {
        return departmentSalary;
    }
}
