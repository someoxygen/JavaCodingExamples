public class Main {
    public static void main(String[] args){
        Car car = new Car("Hyundai Getz",10000,"Gray");

        System.out.println("Car name is " + car.getModel());
        System.out.println("Car price is " + car.getPrice());
        System.out.println("Car color is " + car.getColor());

        car.setModel("Hyundai Accent");
        car.setPrice(-15000);
        car.setPrice(15000);
        car.setColor("Blue");

        System.out.println("Car name is " + car.getModel());
        System.out.println("Car price is " + car.getPrice());
        System.out.println("Car color is " + car.getColor());
    }
}
