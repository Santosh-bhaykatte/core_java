package core_Java.strings;

public class SQLQueryBuilder {
    public static void main(String[] args) {
        StringBuilder query = new StringBuilder("SELECT * FROM Employess WHERE id = 1");

        //User adds filters dynamically
        boolean filterByDept = true;
        boolean filterBySalary = true;

        if (filterByDept) {
            query.append(" AND department = 'IT'");
        }
        if (filterBySalary) {
            query.append(" AND salary > 50000");
        }

        System.out.println("Final query: "+ query.toString());
    }
}
