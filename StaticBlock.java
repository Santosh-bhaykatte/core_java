package core_Java;

//1. A static block is used to initialize static variables or perform one-time setup tasks.
//2. It is executed when the class is loaded into memory.

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Database URL: "+ Database.url);
        System.out.println("Username: "+ Database.username);
    }
}

class Database {
    static String url;
    static String username;

    static {    //static block
        url = "jdbc:mysql://localhost:3456/mydb";
        username = "admin";
        System.out.println("static block executed!");
    }
}
