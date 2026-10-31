public class TwoDArrayExample1 {
    public static void main(String[] args){

        String[][] groceries = {{"apple","orange","grapes"},
                                {"milk","water","chocolate"},
                                {"rice","banana","tea","ice tea"}};
        for(String[] foods: groceries){
            for(String food: foods){
                System.out.print(food + "  ");
            }
            System.out.println();
        }
    }
}
