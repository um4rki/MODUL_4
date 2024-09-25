package lesson8.Task1;

import java.awt.*;
import java.io.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.awt.SystemColor.text;

/**
 * Created by: Umar
 * DateTime: 9/20/2024 9:08 PM
 */
public class NumbersFind {

    public static void main(String[] args) throws IOException {
        File file=new File("file.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String text = br.readLine();

        findAndprint(text, "\\d", "Bir xonali sonlar");

        findAndprint(text, "\\d{2}", "Ikki xonali sonlar");

        findAndprint(text, "\\b[3-8]{3}\\b", "Uch xonali (3-8) sonlar");

        findAndprint(text, "\\b[a-z]{3,7}\\b", "Kichkina harf bilan yozilgan so'zlar");

        findAndprint(text, "\\b[A-Z]{4,7}\\b", "Katta harf bilan yozilgan so'zlar");

        findAndprint(text, "\\bfree\\w*\\b", "\"free\" bilan boshlanadigan so'zlar");

        findAndprint(text, "\\b\\w*stu\\b", "\"stu\" bilan tugagan so'zlar");


    }


    public static void findAndprint(String text, String regex, String description){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        System.out.println(description +";");

        while(matcher.find()){
            System.out.println(matcher.group());
            count++;
        }

        System.out.println(count);
    }

}
