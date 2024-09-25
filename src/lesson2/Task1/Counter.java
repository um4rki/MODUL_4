package lesson2.Task1;

/**
 * Created by: Umar
 * DateTime: 9/9/2024 11:38 AM
 */
public class Counter {
    private int sum = 0;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void counter(){
        setSum(getSum()+1);
    }
}
