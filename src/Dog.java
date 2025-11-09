import Interface.IMammals;

public class Dog implements IMammals {
    @Override
    public void walk() {
        System.out.println("Dog is walking...");
    }

    @Override
    public void eating() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void makeSound() {
        System.out.println("Wooof!!!");
    }
}
