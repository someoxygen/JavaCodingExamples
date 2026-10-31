public class printfExample {
    public static void main(String[] args){
        String name = "Mustafa";
        char character = 'M';
        int age = 31;
        double height = 185.6;
        boolean isEmployed = false; //sadly

        System.out.printf("My name is %s\n",name);
        System.out.printf("My name starts with %c\n",character);
        System.out.printf("I am %d years old.\n",age);
        System.out.printf("My height is %f\n",height);
        System.out.printf("My employment status: %b\n",isEmployed);

        System.out.printf("My name is %s and I am %d years old.\n",name,age);
        System.out.println();

        double price1 = 58.578;
        double price2 = 8548.2237;
        double price3 = -5744.14422;

        System.out.printf("%.2f\n",price1);
        System.out.printf("%.2f\n",price2);
        System.out.printf("%.2f\n",price3);
        System.out.println();

        System.out.printf("%-10.2f\n",price1);
        System.out.printf("%-10.2f\n",price2);
        System.out.printf("%-10.2f\n",price3);
        System.out.println();

        int number1 = 594;
        int number2 = 457476547;
        int number3 = 468468;

        System.out.printf("%10d\n",number1);
        System.out.printf("%10d\n",number2);
        System.out.printf("%10d\n",number3);
        System.out.println();

        System.out.printf("%-10d\n",number1);
        System.out.printf("%-10d\n",number2);
        System.out.printf("%-10d\n",number3);
    }
}
