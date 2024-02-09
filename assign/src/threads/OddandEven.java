package threads;

public class OddandEven extends Thread{
    public void run() {
        for (int i = 1; i <= 60; i++) {
            if(i%2==0)
                System.out.println("Even number: " + i);
            else
                System.out.println("Odd number: " + i);
        }
    }
}