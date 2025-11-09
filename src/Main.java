import Interface.ISpeakFunc;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Chicken chicken = new Chicken();
        Penguin penguin = new Penguin();
        Shark shark = new Shark();
        Shrimp shrimp = new Shrimp();

        dog.eating();
        dog.walk();
        dog.makeSound();

        ISpeakFunc makeDogSound = () -> System.out.println("wooof lambda");
        makeDogSound.words();


        cat.walk();
        cat.eating();
        cat.makeSound();

        ISpeakFunc makeCatSound = () -> System.out.println("MEOW, Motherf*ckers...");
        makeCatSound.words();

        chicken.eating();
        chicken.walking();

        ISpeakFunc makeChickenSound = () -> System.out.println("Anime");
        makeChickenSound.words();

        penguin.eating();
        penguin.walking();

        ISpeakFunc makePenguinSound = () -> System.out.println("Peeep");
        makePenguinSound.words();

        shark.eating();
        shark.swimming();
        shark.sleeping();

        ISpeakFunc makeSharkSound = () -> System.out.println("Shark's Booolk");
        makeSharkSound.words();

        shrimp.eating();
        shrimp.swimming();
        shrimp.sleeping();

        ISpeakFunc makeShrimpSound = () -> System.out.println("Shrimp's Boolk");
        makeShrimpSound.words();
    }
}
