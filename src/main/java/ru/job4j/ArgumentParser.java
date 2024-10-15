package ru.job4j;

public class ArgumentParser {
    public AppArguments parse(String[] args) {
        String directory = null;
        String namePattern = null;
        String searchType = null;
        String outputFile = null;
        for (String arg : args) {
            if (arg.startsWith("-d=")) {
                directory = arg.substring(3);
            } else if (arg.startsWith("-n=")) {
                namePattern = arg.substring(3);
            } else if (arg.startsWith("-t=")) {
                searchType = arg.substring(3);
            } else if (arg.startsWith("-o=")) {
                outputFile = arg.substring(3);
            }
        }
        return new AppArguments(directory, namePattern, searchType, outputFile);
    }
}
