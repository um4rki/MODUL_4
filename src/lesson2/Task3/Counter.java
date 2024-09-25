package lesson2.Task3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by: Umar
 * DateTime: 9/9/2024 4:17 PM
 */
public class Counter {
    private int count = 0;
    Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        count++;
        lock.unlock();
    }

    private void incrementAndGet() {
        synchronized (this){
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}


