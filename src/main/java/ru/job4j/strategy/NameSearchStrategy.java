package ru.job4j.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class NameSearchStrategy implements FileSearchStrategy {

    @Override
    public List<File> search(File directory, String namePattern) {
        List<File> result = new ArrayList<>();
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    result.addAll(search(file, namePattern));
                } else if (file.getName().equals(namePattern)) {
                    result.add(file);
                }
            }
        }
        return result;
    }
}
