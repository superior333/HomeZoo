import Interface.IBirds;

public class Birds extends Animal implements IBirds {

    public void walking(){
        System.out.println("Bird is walking...");
    }

    public void flying(){
        System.out.println("Bird is flying...");
    }

    public void eating(){
        System.out.println("Bird is eating...");
    }
}
