package ru.job4j.strategy;

public class SearchStrategyFactory {
    public static FileSearchStrategy getSearchStrategy(String searchType) {
        switch (searchType) {
            case "mask":
                return new MaskSearchStrategy();
            case "name":
                return new NameSearchStrategy();
            case "regex":
                return new RegexSearchStrategy();
            default:
                throw new IllegalArgumentException("Неверный тип поиска: " + searchType);
        }
    }
}