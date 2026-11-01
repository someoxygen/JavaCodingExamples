import java.awt.*;
import java.time.LocalTime;

public class AlarmClock implements Runnable{
    private final LocalTime localTime;

    public AlarmClock(LocalTime localTime) {
        this.localTime = localTime;
    }

    @Override
    public void run() {
        while (LocalTime.now().isBefore(this.localTime)){

            LocalTime now = LocalTime.now();
            System.out.printf("\r%02d:%02d:%02d",now.getHour(),now.getMinute(),now.getSecond());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted.");
            }
        }
        System.out.println();
        System.out.println("*ALARM NOISES*");
        //DEFAULT BEEP SOUND IN JAVA
        for(int i = 0; i < 10 ; i++){
            Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted.");
            }
        }

    }
}
