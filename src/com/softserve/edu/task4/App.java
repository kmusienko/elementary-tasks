package com.softserve.edu.task4;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        run(args);
    }

    /**
     * runs the application
     * @param args - user's input (path and text to find or replace)
     */
    public static void run(String[] args) {
        if (args.length == 2) {
            Path path = Paths.get(args[0]);
            String textToFind = args[1];
            try {
                System.out.println("Number of coincidences = " +
                                           getNumberOfCoinc(path, textToFind));
            } catch (IOException e) {
                e.getMessage();
            }
        } else if (args.length == 3) {
            Path path = Paths.get(args[0]);
            String textToFind = args[1];
            String textToReplace = args[2];
            try {
                replaceText(path, textToFind, textToReplace);
            } catch (IOException e) {
                e.getMessage();
            }
        } else {
            System.out.println("Incorrect arguments!");
        }
    }

    /**
     * Gets number of coincidence.
     * @param path - file path.
     * @param text - text to find.
     * @return number of coincidence.
     * @throws IOException - IOException.
     */
    public static int getNumberOfCoinc(Path path, String text)
            throws IOException {
        List<String> textList = Files.readAllLines(path);
        int counter = 0;
        for (String line : textList) {
            Pattern p = Pattern.compile(text);
            Matcher m = p.matcher(line);
            while (m.find()) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Replaces text
     * @param path - file path.
     * @param textToFind - text to find.
     * @param textToReplace - text to replace.
     * @throws IOException - IOException.
     */
    public static void replaceText(Path path, String textToFind,
                                   String textToReplace) throws IOException {
        List<String> textList = Files.readAllLines(path);
        StringBuilder textToWrite = new StringBuilder();
        for (String s : textList) {
            String updatedText = s.replaceAll(textToFind, textToReplace) + "\n";
            textToWrite.append(updatedText);
        }
        PrintWriter out = new PrintWriter(path.toString());
        out.print(textToWrite);
        out.close();
    }
}
