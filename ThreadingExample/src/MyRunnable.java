public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i == 5){
                System.out.println("Your time is up!");
                System.exit(0);
            }
        }
    }
}
