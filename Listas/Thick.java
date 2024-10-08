import java.util.Random;

public class Thick extends Thread {

    public void run() {
        Random random = new Random();
        int thicks = 0;
        int index = 30;
        

        for(int i = 0; i < index; i++) {
            int start = 1;
            int end = 10;
            int rTime;
            rTime = random.nextInt(start, end);
            System.out.println("Time:" + thicks);
            System.out.println("Random Time:" + rTime);
            thicks++;
            try {
                sleep(rTime * 1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        


        
    }
}