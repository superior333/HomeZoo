public class Penguin extends Birds{
    @Override
    public void flying() {
        System.out.println("Penguin is flying now...");
    }

    @Override
    public void walking() {
        System.out.println("Penguin is walking now....");
    }

    @Override
    public void eating() {
        System.out.println("Penguin is eating now....");
    }
}
