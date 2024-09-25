package lesson1.Task2;

/**
 * Created by: Umar
 * DateTime: 9/6/2024 4:08 PM
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {

        Thread thread = new Thread(new MyThread());
        thread.start();
    }
}
