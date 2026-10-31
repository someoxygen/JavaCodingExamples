public class InheritanceExample {
    public static void main(String[] args){
        Dog dog = new Dog("burk","red",1);
        Cat cat = new Cat("nord","blue",9);

        System.out.println(dog.isAlive);
        System.out.println(dog.name);
        System.out.println(dog.color);

        System.out.println(cat.isAlive);
        System.out.println(cat.name);
        System.out.println(cat.color);

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();
    }
}
