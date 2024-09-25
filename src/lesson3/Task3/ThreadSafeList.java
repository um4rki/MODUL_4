package lesson3.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by: Umar
 * DateTime: 9/11/2024 6:02 PM
 */
public class ThreadSafeList {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> threadSafeList = Collections.synchronizedList(new ArrayList<>());

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                threadSafeList.add(i);
            }
        });
        thread.start();
        thread.join();

        System.out.println(threadSafeList.size());
    }
}
