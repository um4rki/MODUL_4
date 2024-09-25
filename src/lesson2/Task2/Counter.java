package lesson2.Task2;

/**
 * Created by: Umar
 * DateTime: 9/9/2024 11:40 AM
 */
public class Counter {
    private int sum = 0;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public synchronized void counter() {
        setSum(getSum() + 1);
    }
}
