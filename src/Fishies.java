import Interface.IFisheis;

public class Fishies extends Animal implements IFisheis {
    public void swimming(){
        System.out.println("Fish is swimming...");
    }

    public void eating(){
        System.out.println("Fish is eating...");
    }

    public void sleeping(){
        System.out.println("Fish is sleeping...");
    }
}
