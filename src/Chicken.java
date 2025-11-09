import Interface.IBirds;

public class Chicken extends Birds {
    @Override
    public void flying() {
        System.out.println("Chicken is flying now...");
    }

    @Override
    public void walking() {
        System.out.println("Chicken is walking now....");
    }

    @Override
    public void eating() {
        System.out.println("Chicken is eating now....");
    }
}
