public class Cat extends Animal{
    int lives;

    Cat(String name, String color, int lives){
        super(name, color);
        this.lives = lives;
    }

    void speak(){
        System.out.println("Cat speaks meow meow meow...");
    }
}
