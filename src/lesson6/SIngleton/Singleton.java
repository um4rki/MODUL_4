package lesson6.SIngleton;

/**
 * Created by: Umar
 * DateTime: 9/17/2024 9:56 PM
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}

