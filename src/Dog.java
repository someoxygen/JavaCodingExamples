public class Dog extends Animal {
    int lives;

    Dog(String name, String color,int lives){
        super(name,color);
        this.lives = lives;
    }

    void speak(){
        System.out.println("Dog speaks hav hav hav...");
    }
}
