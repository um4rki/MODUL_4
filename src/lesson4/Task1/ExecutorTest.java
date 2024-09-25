package lesson4.Task1;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by: Umar
 * DateTime: 9/13/2024 6:27 PM
 */
public class ExecutorTest {

    private final Executor executor;

    public ExecutorTest(Executor executor) {
        this.executor = executor;
    }

    public void method(Runnable task){
        executor.execute(task);
    }


    public static void main(String[] args) {
        Executor fixedExecutor = Executors.newFixedThreadPool(5);

        ExecutorTest executorTest = new ExecutorTest(fixedExecutor);

        for (int i = 0; i < 10; i++) {
            executorTest.method(() ->{
                System.out.println(Thread.currentThread().getName());
            });
        }
    }
}
