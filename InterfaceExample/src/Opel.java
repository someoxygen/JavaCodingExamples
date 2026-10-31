public class Opel implements Car,Vehicle{
    @Override
    public void start() {
        System.out.println("Opel car starts.");
    }

    @Override
    public void drive() {
        System.out.println("Opel car driving.");
    }

    @Override
    public void stop() {
        System.out.println("Opel car stops.");
    }

    @Override
    public void move() {
        System.out.println("Opel car moves.");
    }
}
