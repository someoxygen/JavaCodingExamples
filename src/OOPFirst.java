public class OOPFirst {
    public static void main(String[] args){
        Car car1 = new Car("Fiat","Egea",2025);

        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.creationYear);
        System.out.println("Your cars situation: " + car1.isRunning);
        car1.start();
        System.out.println("Your cars situation: " + car1.isRunning);
        car1.stop();
        System.out.println("Your cars situation: " + car1.isRunning);
        car1.start();
        System.out.println("Your cars situation: " + car1.isRunning);

        car1.drive();

        Car[] cars = {new Car("Opel","Astra",2022),
                      new Car("Renault","Clio",2019),
                      new Car("Hyundai","Getz",2011)};
        for(Car car : cars){
            car.drive();
        }

        Car car2 = new Car("Ford","Fiesta",2017);
        System.out.println(car2);

        Car car3 = new Car("BMW","A4",2023);
        System.out.println(car3);
    }
}
