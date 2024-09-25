package lesson1.Task1;

/**
 * Created by: Umar
 * DateTime: 9/6/2024 4:03 PM
 */
public class MyThread extends Thread{

    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Thread "+i+" is running");
        }

    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

    }
}
