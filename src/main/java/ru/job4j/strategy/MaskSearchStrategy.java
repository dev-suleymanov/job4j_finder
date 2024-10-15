package ru.job4j.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MaskSearchStrategy implements FileSearchStrategy {
    @Override
    public List<File> search(File directory, String mask) {
        List<File> result = new ArrayList<>();
        String regex = convertMaskToRegex(mask);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    result.addAll(search(file, mask));
                } else if (file.getName().matches(regex)) {
                    result.add(file);
                }
            }
        }
        return result;
    }

    private String convertMaskToRegex(String mask) {
        String regex = mask.replace(".", "\\.").replace("?", ".").replace("*", ".*");
        return regex;
    }
}
