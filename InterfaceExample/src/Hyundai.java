public class Hyundai implements Car, Vehicle{
    @Override
    public void start() {
        System.out.println("Hyundai car started.");
    }

    @Override
    public void drive() {
        System.out.println("Hyundai car driving.");
    }

    @Override
    public void stop() {
        System.out.println("Hyundai car stopped.");
    }

    @Override
    public void move() {
        System.out.println("Hyundai car moves.");
    }
}
