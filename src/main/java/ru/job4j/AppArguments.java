package ru.job4j;

public class AppArguments {
    private final String directory;
    private final String namePattern;
    private final String searchType;
    private final String outputFile;

    public AppArguments(String directory, String namePattern, String searchType, String outputFile) {
        this.directory = directory;
        this.namePattern = namePattern;
        this.searchType = searchType;
        this.outputFile = outputFile;
    }

    public String getDirectory() {
        return directory;
    }

    public String getNamePattern() {
        return namePattern;
    }

    public String getSearchType() {
        return searchType;
    }

    public String getOutputFile() {
        return outputFile;
    }
}
