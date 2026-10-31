public class StaticExample {
    public static void main(String[] args){
        Friend friend1 = new Friend("Mustafa");
        Friend.WriteFriendCount();
        Friend friend2 = new Friend("Mert");
        Friend.WriteFriendCount();
        Friend friend3 = new Friend("Metin");
        Friend.WriteFriendCount();
        Friend friend4 = new Friend("Mehmet");
        Friend.WriteFriendCount();
        Friend friend5 = new Friend("Murat");
        Friend.WriteFriendCount();
    }
}
