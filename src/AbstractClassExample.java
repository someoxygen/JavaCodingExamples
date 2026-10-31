public class AbstractClassExample {
    public static void main(String[] args){
        //Shape shape = new Shape(); -> ABSTRACT CLASSES CANT BE USED LIKE THIS

        Circle circle = new Circle(3);
        circle.display();
        System.out.println(circle.area());

        Rectangle rectangle = new Rectangle(4,5);
        rectangle.display();
        System.out.println(rectangle.area());
    }
}
