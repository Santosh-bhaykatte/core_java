package core_Java.functionalInterfaces.utils;

import java.util.function.Function;

interface UserCreator {
    User getUser(String fname, String lname);
}

class User {
    String fname;
    String lname;

    public User(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
}

public class FunctionUtils {
    public static <T,R> R transform(T value, Function<T,R> func) {
        return func.apply(value);
    }

    public static void main(String[] args) {
        /*
        String str = transform("hello", (s) -> s.toUpperCase());
        System.out.println(str);

        int res = transform(5, (n) -> n * n);
        System.out.println(res);

        int prim = transform("123", Integer::parseInt);
        System.out.println(prim);

         */

        UserCreator userCreator = User::new;        //Constructor reference
        User user = userCreator.getUser("John", "Snow");

        //Generate username
        String username = transform(user, (u) -> {
            return u.fname.toLowerCase() + u.lname.toLowerCase() +"@12";
        });
        System.out.println("Username: "+ username);
    }
}
