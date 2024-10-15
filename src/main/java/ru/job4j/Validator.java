package ru.job4j;

import java.io.File;

public class Validator {
    public static void validate(AppArguments args) {
        if (args.getDirectory() == null || !new File(args.getDirectory()).exists()) {
            throw new IllegalArgumentException("Директория не существует: " + args.getDirectory());
        }
        if (args.getNamePattern() == null) {
            throw new IllegalArgumentException("Имя файла, маска или регулярное выражение обязательно.");
        }
        if (args.getSearchType() == null) {
            throw new IllegalArgumentException("Тип поиска обязателен.");
        }
        if (args.getOutputFile() == null) {
            throw new IllegalArgumentException("Выходной файл обязателен.");
        }
    }
}
