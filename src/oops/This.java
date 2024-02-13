package oops;

public class This {
    int EmpId;
    String EmpName;
    double EmpSalary;

    // MEMBER METHOD - WITHOUT (this)
//    public void EmpDetails(int Id, String Name, double Salary) {
//        EmpId = EmpId;
//        EmpName = EmpName;
//        EmpSalary = EmpSalary;
//    }
//    public void showEmpDetails(){
//        System.out.println("Employee Id : " + EmpId);
//        System.out.println("Employee Name : " + EmpName);
//        System.out.println("Employee Salary : " + EmpSalary);
//    }

    // MEMBER METHOD - WITH (this)
    public void EmpDetails(int EmpId, String EmpName, double EmpSalary) {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.EmpSalary= EmpSalary;
    }
    public void showEmpDetails() {
        System.out.println("Employee Id : " + EmpId);
        System.out.println("Employee Name : " + EmpName);
        System.out.println("Employee Salary : " + EmpSalary);
    }

    // MAIN
    public static void main(String[] args) {
        // OBJECT
        This t = new This();

        // CALL METHODS
        t.EmpDetails(104, "Sazia", 357000);
        t.showEmpDetails();
    }
}
