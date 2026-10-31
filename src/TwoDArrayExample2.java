public class TwoDArrayExample2 {
    public static void main(String[] args){
        char[][] phoneNumbers = {{'1','2','3'},
                                 {'4','5','6'},
                                 {'7','8','9'},
                                 {'*','0','#'}};
        for(char[] numbers : phoneNumbers){
            for(char number : numbers){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
