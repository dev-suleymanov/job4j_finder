package ru.job4j;

import java.io.*;
import java.util.List;

public class FileSearchResultWriter {
    public void writeResultsToFile(List<File> foundFiles, String outputPath) {
        try (FileWriter writer = new FileWriter(outputPath)) {
            for (File file : foundFiles) {
                writer.write(file.getAbsolutePath() + System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}