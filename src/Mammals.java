import Interface.IMammals;

public class Mammals extends Animal implements IMammals {

    public void walk() {
        System.out.println("Mammal is walking...");
    }

    public void eating() {
        System.out.println("Mammal is eating...");
    }

    public void makeSound() {
        System.out.println("Mammal is makesound...");
    }
}
