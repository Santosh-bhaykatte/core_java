package core_Java.animals;

class OtherAnimal {
    void makeSound() {
        System.out.println("Animal is making sound.");
    }
}
class OtherDog extends OtherAnimal {
    @Override
    void makeSound() {
        System.out.println("Dog is barking.");
    }
}
class OtherCat extends OtherAnimal {
    @Override
    void makeSound() {
        System.out.println("Cat is meowing.");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        OtherAnimal animal;     //reference of Super class

        animal = new OtherDog();    //refer to Dog object
        animal.makeSound();

        animal = new OtherCat();    //refer to Cat object
        animal.makeSound();
    }
}
