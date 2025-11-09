import Interface.IMammals;


public class Cat extends Mammals {
    @Override
    public void walk() {
        System.out.println("Cat is Walking...");
    }

    @Override
    public void eating() {
        System.out.println("Cat is Eating...");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is Meow...");
    }
}
