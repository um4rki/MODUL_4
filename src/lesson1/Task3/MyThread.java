package lesson1.Task3;

/**
 * Created by: Umar
 * DateTime: 9/6/2024 6:16 PM
 */
public class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread " + i);
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
