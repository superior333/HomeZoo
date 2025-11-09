import Interface.IBirds;
import Interface.IFisheis;

public class Shark extends Fishies {
    @Override
    public void swimming() {
        System.out.println("Shark is swimming...");
    }

    @Override
    public void eating() {
        System.out.println("Shark is eating...");
    }

    @Override
    public void sleeping() {
        System.out.println("Shark is sleeping...");
    }

}
