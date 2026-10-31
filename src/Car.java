public class Car {
    public String name;
    public String model;
    public int creationYear;
    public boolean isRunning;

    Car(String name, String model, int creationYear){
        this.name = name;
        this.model = model;
        this.creationYear = creationYear;
        this.isRunning = false;
    }

    public void start(){
        isRunning = true;
        System.out.println("You started the car.");
    }

    public void stop(){
        isRunning = false;
        System.out.println("You stopped the car.");
    }
    public void drive(){
        System.out.println("You drive a " + name + " " + model + " car.");
    }
}
