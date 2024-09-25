package lesson8.Task2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by: Umar
 * DateTime: 9/21/2024 2:06 PM
 */
public class FindingLogic {
    public static void main(String[] args) throws IOException {

        File file = new File("file.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String text = br.readLine();

        finding(text,"\\d","Bir xonali sonlar");
        finding(text,"\\d{2}","Ikki xonali sonlar");
        finding(text,"\\b[3-8]{3}\\b","Uch xonali 3 dan 8 gacha sonlar");
        finding(text,"\\b[a-z]{3,7}\\b","Kichkina harfda yozilgan uzunligi 3 dan 7 gacha bo'lgan so'zlar");
        finding(text,"\\b[A-Z]{4,7}\\b","Katta harfda yozilgan uzunligi 4 dan 7 gacha bo'lgan so'zlar");
        finding(text,"\\bfree\\w*\\b","free bilan boshlanadigan so'zlar");
        finding(text,"\\b\\w*stu\\b","stu bilan tugagan so'zlar");


    }

    public static void finding(String text, String regex, String description){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        System.out.println(description+";");

        while (matcher.find()) {
            System.out.println(matcher.group());
            count++;
        }

        System.out.println("soni: " + count );
    }
}
