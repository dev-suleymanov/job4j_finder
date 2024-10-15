package ru.job4j;

import ru.job4j.strategy.FileSearchStrategy;
import ru.job4j.strategy.SearchStrategyFactory;

import java.io.File;
import java.util.List;

public class FinderApp {
    public static void main(String[] args) {
        HelpMessage.printHelp();
        ArgumentParser argumentParser = new ArgumentParser();
        AppArguments appArguments = argumentParser.parse(args);
        Validator.validate(appArguments);
        FileSearchStrategy strategy = SearchStrategyFactory.getSearchStrategy(appArguments.getSearchType());
        List<File> foundFiles = strategy.search(new File(appArguments.getDirectory()), appArguments.getNamePattern());
        FileSearchResultWriter resultWriter = new FileSearchResultWriter();
        resultWriter.writeResultsToFile(foundFiles, "output.txt");
    }
}
