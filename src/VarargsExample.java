public class VarargsExample {
    public  static void main(String[] args){

        int total = add(1,2,3,4,5);
        int average = average(1,2,3,4,5);
        System.out.println("Total= "+total);
        System.out.println("Average= "+average);
    }

    public static int add(int... numbers){
        int total = 0;
        for(int number : numbers){
            total += number;
        }
        return total;
    }

    public static int average(int... numbers){
        int total = 0;
        for(int number : numbers){
            total += number;
        }
        return total / numbers.length;
    }
}
