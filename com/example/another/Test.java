package core_Java.com.example.another;

import core_Java.com.example.PublicExample;
import core_Java.com.example.PrivateExample;
import core_Java.com.example.ProtectedExample;
import core_Java.com.example.DefaultExample;

public class Test {
    public static void main(String[] args) {
        //public access
        PublicExample ob = new PublicExample();
        System.out.println("public variable: "+ ob.publicVar);
        ob.publicMethod();
        System.out.println();

        //private access
        PrivateExample obj = new PrivateExample();
        obj.privateAccess();
        System.out.println();

        //protected access within same package
        ProtectedSubClass psc = new ProtectedSubClass();
        psc.protectedAccess();

        //default access outside package
        DefaultExample dobj = new DefaultExample();
//        System.out.println("default variable: "+ dobj.defaultVar);    //can not be accessed from outside package
//        dobj.defaultMethod(); //can not be accessed from outside package
    }
}

//protected access outside the package
class ProtectedSubClass extends ProtectedExample {
    protected void protectedAccess() {
        System.out.println("protected variable: "+ protectedVar);
        protectedMethod();
    }
}
