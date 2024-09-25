package lesson7.Task5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
public class Task_5 {

    public static void main(String[] args) throws IOException {
        File source = new File("D:\\AAA");
        File destination = new File("D:\\BBB");
        copyFolder(source, destination);
    }

    public static void copyFolder(File source, File destination) throws IOException {
        if (!destination.exists()) {
            destination.mkdirs();
        }
        File[] files = source.listFiles();
        if (files != null) {
            for (File file : files) {
                File destFile = new File(destination, file.getName());
                if (file.isDirectory()) {
                    copyFolder(file, destFile);
                } else {
                    Files.copy(file.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }
    }
}
