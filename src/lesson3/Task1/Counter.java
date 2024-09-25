package lesson3.Task1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by: Umar
 * DateTime: 9/11/2024 2:44 PM
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
}
