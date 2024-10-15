package ru.job4j.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RegexSearchStrategy implements FileSearchStrategy {
    @Override
    public List<File> search(File directory, String regex) {
        List<File> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    result.addAll(search(file, regex));
                } else if (pattern.matcher(file.getName()).matches()) {
                    result.add(file);
                }
            }
        }
        return result;
    }
}
