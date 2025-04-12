package core_Java;

//Constructor chaining is the process of calling one constructor from another constructor in the same class or in the parent class.

//this(): Calls another constructor in the same class.
//super(): Calls a constructor in the parent class.

public class ConstructorChaining {
    class Person {
        String name;
        int age;
        Person() {
            this("unkonwn", 0);     //call parameterized constructor
        }
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();
        Person p = obj.new Person();
        Person p1 = obj.new Person("Tony", 55);

        Dog dog = new Dog("hybrid", "pitbull");
        Dog anotherDog = new Dog(dog);
        System.out.println(dog.type);
        System.out.println(dog.breed);

        System.out.println(anotherDog.type);
        System.out.println(anotherDog.breed);

        Cat cat = new Cat(dog);
        System.out.println(cat.type);
        System.out.println(cat.breed);

        System.out.println(p.name +" "+ p.age);
        System.out.println(p1.name +" "+ p1.age);
    }
}

class Animal {
    String type;
    Animal(String type) {
        this.type = type;
    }
}

class Dog extends Animal {
    String breed;
    Dog(String type, String breed) {
        super(type);
        this.breed = breed;
    }
    Dog(Dog dog) {
        super(dog.type);
        this.breed = dog.breed;
    }
}

class Cat extends Animal {
    String breed;
    Cat(Dog d) {    //copy constructor takes reference to another object as parameter
        super(d.type);
        this.breed = d.breed;
    }
}