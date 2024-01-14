package udemy.java17MasterClass.section7.Inheritance.part1;

public class Run {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal","Huge",400);
        doAnimalStuffs(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuffs(dog, "fast");
    }

    public static void doAnimalStuffs(Animal animal, String speed) { // this is static because we want to call it from the main method.
        animal.move(speed);
        animal.makeNoise();
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }
}
