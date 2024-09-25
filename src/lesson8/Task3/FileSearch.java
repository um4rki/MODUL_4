package lesson8.Task3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.regex.Pattern;

/**
 * Created by: Umar
 * DateTime: 9/22/2024 7:33 PM
 */
public class FileSearch extends RecursiveTask<List<File>> {
    private final File directory;
    private final Pattern pattern;

    public FileSearch(File directory, String regex) {
        this.directory = directory;
        this.pattern = Pattern.compile(regex);
    }


    @Override
    protected List<File> compute() {
        List<File> files = new ArrayList<>();
        List<FileSearch> tasks = new ArrayList<>();

        File[] entries = directory.listFiles();
        if (entries != null) {
            for (File entry : entries) {
                if(entry.isDirectory()) {
                    FileSearch task = new FileSearch(entry, pattern.toString());
                    task.fork();
                    tasks.add(task);
                }else {
                    if(pattern.matcher(entry.getName()).matches()) {
                        files.add(entry);
                    }
                }
            }
        }
        return files;
    }

    public static void main(String[] args) {
        File startingDir = new File("D:/");
        String regex = "\\w*mp.3\\b";

        ForkJoinPool pool = new ForkJoinPool();
        FileSearch task = new FileSearch(startingDir, regex);

        List<File> files = pool.invoke(task);
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
