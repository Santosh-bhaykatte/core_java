package core_Java;

class NewAnimal {
    void eat() {
        System.out.println("Animal is eating..");
    }
}
class newDog extends NewAnimal {
    void bark() {
        System.out.println("Dog is barking..");
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        newDog newDog = new newDog();
        newDog.eat();
        newDog.bark();
    }
}
