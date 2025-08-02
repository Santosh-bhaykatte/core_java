package core_Java.caseStudies;

class Employee {
    private String name;
    private char gender;
    private double yoe;
    private String designation;
    private double b_salary;
    private String status;

    public double getYoe() {
        return yoe;
    }
    public void setDesignation(String desg) {
        this.designation = desg;
    }
    public String getDesignation() {
        return designation;
    }
    public void setB_salary(double b_salary) {
        this.b_salary = b_salary;
    }

    public Employee(String name, char gender) {
        this.name = name;
        this.gender = gender;
        yoe = 0.0;
        designation = "ASE";
        b_salary = 10000.0;
        status = "Active";
    }
    public Employee(String name, char gender, double yoe) {
        this.name = name;
        this.gender = gender;
        this.yoe = yoe;

        setDesignB_salary();    // Set designation & b_salary

        status = "Active";
    }
    public void setDesignB_salary() {
        if (yoe >= 3) {
            setDesignation("ITA");
            setB_salary(15000.0);
        } else {
            setDesignation("ASE");
            setB_salary(10000.0);
        }
    }

    public double promoteEmp() {
        if (getDesignation().equalsIgnoreCase("ASE")) {
            setDesignation("ITA");
            return this.b_salary = this.b_salary + (this.b_salary * 5)/100;
        } else if (getDesignation().equalsIgnoreCase("ITA")) {
            setDesignation("AST");
            return this.b_salary = this.b_salary + (this.b_salary * 8)/100;
        } else {
            setDesignation("ASC");
            return this.b_salary = this.b_salary + (this.b_salary * 10)/100;
        }
    }
    public void applyForWP() {
        this.status = "Inactive";
        this.b_salary = 0;
    }
    @Override
    public String toString() {
        return "Employee [name = "+ name +", gender = "+ gender +", yoe = "+ yoe +", desg = "+ designation +", b_salary = "+ b_salary +" status = "+ status +"]";
    }
}

public class CaseStudy1 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Santo", 'M');
        Employee employee2 = new Employee("Sony", 'F', 5);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        System.out.println();

        employee1.promoteEmp();
        employee2.promoteEmp();

        employee1.applyForWP();

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}
