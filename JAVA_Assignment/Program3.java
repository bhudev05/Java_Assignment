import java.util.*;


public class Program3 {
    static class Employee{
        int empId, empSalary;
        String empName, empDesignation, empLocation;

        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public int getEmpSalary() {
            return empSalary;
        }

        public void setEmpSalary(int empSalary) {
            this.empSalary = empSalary;
        }

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public String getEmpDesignation() {
            return empDesignation;
        }

        public void setEmpDesignation(String empDesignation) {
            this.empDesignation = empDesignation;
        }

        public String getEmpLocation() {
            return empLocation;
        }

        public void setEmpLocation(String empLocation) {
            this.empLocation = empLocation;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Employee> obj = new LinkedList<>();
        System.out.println("Enter 10 Employee's Id, Name, Designation, Location and Salary Below");
        try{
            for(int i=0;i<10;i++){
                Employee emp = new Employee();
                emp.setEmpId(sc.nextInt());
                emp.setEmpName(sc.next());
                emp.setEmpDesignation(sc.next());
                emp.setEmpLocation(sc.next());
                emp.setEmpSalary(sc.nextInt());
                obj.addLast(emp);

            }
        }
        catch (Exception e){}
        System.out.println("All names employees");
        obj.stream().forEach(e ->{System.out.println(e.getEmpName());});
        System.out.println();

        System.out.println("All salaries > 50,000");
        obj.stream().filter(e->e.getEmpSalary()>50000).forEach(e->{System.out.println(String.format("Name : %s , Salary : %i",e.getEmpName(),e.getEmpSalary()));});
        System.out.println();

        System.out.println("All locations starting with letter \'M\'");
        obj.stream().filter(e ->e.getEmpLocation().startsWith("M")).forEach(e->{System.out.println(String.format("Name : %s , Salary : %i",e.getEmpName(),e.getEmpLocation()));});
        System.out.println();

        System.out.println("All designations stating with \\'E\\");
        obj.stream().filter(e ->e.getEmpDesignation().startsWith("E")).forEach(e->{ System.out.println(String.format("Name : %s , Designation : %s",e.getEmpName(),e.getEmpDesignation()));});

    }
}