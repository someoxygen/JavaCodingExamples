public class Friend {
    String name;
    static int friendCount = 0; //STATIC VARIABLE

    Friend(String name){
        this.name = name;
        friendCount++;
    }

    //STATIC METHOD
    public static void WriteFriendCount(){
        System.out.println("Your friend count is "+ friendCount);
    }

}
