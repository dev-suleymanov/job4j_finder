package ru.job4j.strategy;

import java.io.File;
import java.util.List;

public interface FileSearchStrategy {
    List<File> search(File directory, String namePattern);
}
