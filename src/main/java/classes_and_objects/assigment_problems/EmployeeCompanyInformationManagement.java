package classes_and_objects.assigment_problems;

class CompanyEmployee {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    CompanyEmployee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class EmployeeCompanyInformationManagement {
    public static void main(String[] args) {
        new CompanyEmployee("Aisha", 50000);
        new CompanyEmployee("Rohit", 55000);
        new CompanyEmployee("Meena", 60000);

        CompanyEmployee.printCompanyInfo();
    }
}
