package lesson1.Task4;

/**
 * Created by: Umar
 * DateTime: 9/6/2024 6:23 PM
 */
public class MyDaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("MyDaemonThread is running");
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        MyDaemonThread t = new MyDaemonThread();
        t.setDaemon(true);
        t.start();


        for (int i = 0 ; i < 10 ; i++){
            System.out.println("MyDaemonThread is running");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main thread is running");
    }
}
