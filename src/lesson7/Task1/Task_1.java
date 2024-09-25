package lesson7.Task1;

import java.io.File;

import static java.lang.Math.pow;

public class Task_1 {
    public static void main(String[] args) {
        File folder = new File("D:\\");
        Folder_sizeCheck_andCalculate(folder);
    }

    public static void Folder_sizeCheck_andCalculate(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    long size = getFolderSize(file);
                    System.out.println(file.getName() + "->>" + formatSize(size));
                }
            }
        }
    }

    public static long getFolderSize(File folder) {
        long length = 0;
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    length += file.length();
                } else {
                    length += getFolderSize(file);
                }
            }
        }
        return length;
    }

    public static String formatSize(long size) {
        if (size>=pow(1024,3)) {
            return size/(pow(1024,3)) + " GB";
        } else if (size>=pow(1024,2)) {
            return size/(pow(1024,2)) + " MB";
        } else {
            return size/1024+ " KB";
        }
    }
}
