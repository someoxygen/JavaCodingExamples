import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        };

        //timer.schedule(task,2000,1000);


        TimerTask task2 = new TimerTask() {
            int count = 5;
            @Override
            public void run() {
                if(count > 0){
                    System.out.println("Hello!");
                }
                else {
                    System.out.println("Task completed!");
                    timer.cancel();
                }
                count--;
            }
        };

        timer.schedule(task2,0,2000);
    }
}
