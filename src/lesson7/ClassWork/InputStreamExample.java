package lesson7.ClassWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by: Umar
 * DateTime: 9/21/2024 2:50 PM
 */
public class InputStreamExample {
    public static void main(String[] args) {
        File file = new File("files/Pdp.txt");

        try (InputStream inputStream = new FileInputStream(file)) {

            byte[] bytes = inputStream.readAllBytes();

            String str = new String(bytes);
            System.out.println(str);

//            int read = inputStream.read();
//
//            char symbol = (char) read;
//            System.out.println(symbol);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
