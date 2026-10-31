public class Main {
    public static void main(String[] args){
        Hyundai hyundai = new Hyundai();
        hyundai.start();
        hyundai.move();
        hyundai.drive();
        hyundai.stop();

        Opel opel = new Opel();
        opel.start();
        opel.move();
        opel.drive();
        opel.stop();
    }
}
