package ru.job4j;

public class HelpMessage {
    public static void printHelp() {
        System.out.println("Использование: java -jar finder.jar -d=<директория> -n=<имя файла> -t=<тип поиска> -o=<выходной файл>");
        System.out.println("Типы поиска:");
        System.out.println("  mask - поиск по маске");
        System.out.println("  name - поиск по полному имени");
        System.out.println("  regex - поиск по регулярному выражению");
    }
}
