public class Animal {
    boolean isAlive;
    String name;
    String color;
    Animal(String name, String color){
        this.name = name;
        this.color = color;
        this.isAlive = true;
    }

    void eat(){
        System.out.println("The animal eats.");
    }
}
