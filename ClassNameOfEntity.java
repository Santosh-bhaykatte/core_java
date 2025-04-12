package core_Java;

public class ClassNameOfEntity {
    public static void main(String[] args) {
        int[] arr = new int[3];
        //getClass() - method of Object class, returns obj of Type Class
        //getName() - method of Class class, returns string
//        Class c = arr.getClass();
//        String className = c.getName();
        String arrName = arr.getClass().getName();

        Integer i = new Integer(10);
        String iName = i.getClass().getName();
//        System.out.println(iName);

        System.out.println(arrName);
        System.out.println(String.class.getClassLoader());
        System.out.println(String.class.getName());
        System.out.println(Byte.class.getName());
        System.out.println((new Object[3]).getClass());
        System.out.println((new int[3][3][3][3]).getClass());
    }
}
