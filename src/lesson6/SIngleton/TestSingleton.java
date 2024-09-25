package lesson6.SIngleton;

import lesson4.Task1.ExecutorTest;

import java.util.concurrent.Executor;

/**
 * Created by: Umar
 * DateTime: 9/17/2024 9:58 PM
 */
public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton);
    }
}
