public class Car {
    private String model;
    private double price;
    private String color;

    Car(String model, double price, String color){
        this.model = model;
        this.price = price;
        this.color = color;
    }

    String getModel(){
        return this.model;
    }

    double getPrice(){
        return this.price;
    }

    String getColor(){
        return this.color;
    }

    void setModel(String model){
        this.model = model;
    }

    void setPrice(double price){
        if(price < 0) {
            System.out.println("Price cant be less than zero.");
        }else {
            this.price = price;
        }

    }

    void setColor(String color){
        this.color = color;
    }

}
