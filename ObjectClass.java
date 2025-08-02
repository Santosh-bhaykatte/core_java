package core_Java;

class Student {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [ name = "+ name +", age = "+ age +"]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            return this.name.equals(s.name) && this.age == age;
        }
        return false;
    }

    /*
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;   // Same object → true
        if (obj == null || getClass() != obj.getClass()) return false;  // Different class → false
        Student student = (Student) obj;
        return this.name.equals(student.name) && this.age == student.age;   // Compare fields
    }

     */
}

class Person {

}

public class ObjectClass {
    public static void main(String[] args) {
        Student s1 = new Student("Santo", 22);
        Student s2 = new Student("Santo", 22);
        Student s3 = s1;


        System.out.println(s1.equals(s2));      // Default implementation (check for references like ==)
        System.out.println(s1.equals(s3));

        Person p = new Person();

        System.out.println(s1.equals(s1));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(null));
        System.out.println(s1.equals(p));
    }
}
