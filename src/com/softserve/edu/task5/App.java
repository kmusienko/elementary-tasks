package com.softserve.edu.task5;

import com.ibm.icu.text.RuleBasedNumberFormat;
import java.util.*;

/**
 * Created by Kostya on 25.05.2017.
 */
public class App {
    public static void main(String[] args) {
        try {
            System.out.println("Please, enter the number: ");
            Scanner scanner = new Scanner(System.in);
            long number = scanner.nextLong();
            System.out.println(getWordTransformedNumber(number));
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
        }
    }

    /**
     * Gets transformed number into words.
     * @param number - number which user has entered.
     * @return transformed number.
     */
    public static String getWordTransformedNumber(long number) {
        RuleBasedNumberFormat numberFormat = new RuleBasedNumberFormat(
                Locale.forLanguageTag("en"),
                RuleBasedNumberFormat.SPELLOUT);
        return numberFormat.format(number);
    }

}
