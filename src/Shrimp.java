import Interface.IBirds;
import Interface.IFisheis;

public class Shrimp extends Fishies{
    @Override
    public void swimming() {
        System.out.println("Shrimp is swimming...");
    }

    @Override
    public void eating() {
        System.out.println("Shrimp is eating...");
    }

    @Override
    public void sleeping() {
        System.out.println("Shrimp is sleeping...");
    }
}
