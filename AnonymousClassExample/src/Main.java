public class Main {
    public static void main(String[] args){

        Dog regularDog = new Dog();
        Dog scoobyDoo = new Dog(){
          @Override
          void speak(){
              System.out.println("Scooby Doo says Hello friends!");
          }
        };

        regularDog.speak();
        scoobyDoo.speak();
    }
}
