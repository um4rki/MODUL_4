package lesson2.Task3;

import java.util.concurrent.locks.Lock;

/**
 * Created by: Umar
 * DateTime: 9/9/2024 4:22 PM
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
//                    new Thread(counter);
                }
            }
        };


        System.out.println("Final counter: " + counter.getCount());
    }
}
