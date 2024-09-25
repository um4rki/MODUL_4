package lesson3.Task2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by: Umar
 * DateTime: 9/11/2024 5:45 PM
 */
public class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    public void counter(){
        count.incrementAndGet();
    }

    public AtomicInteger getCount() {
        return count;
    }

    public void setCount(AtomicInteger count) {
        this.count = count;
    }


    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() ->{
            for (int i = 0; i < 1000; i++) {
                counter.counter();
            }
        });

        t1.start();
        t1.join();

        System.out.println(counter.getCount());
    }
}
