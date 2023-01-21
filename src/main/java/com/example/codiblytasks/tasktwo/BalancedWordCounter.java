package com.example.codiblytasks.tasktwo;

import java.util.HashMap;
import java.util.Map;


public class BalancedWordCounter {

    public int count(String input) {
        if (input != null) {
            if (input.isEmpty()) {
                return 0;
            }
            if (isOnlyLetters(input)) {
                return countBalance(input);
            }
        }
        throw new RuntimeException();
    }

    private int countBalance(String word) {
        int counter = 0;
        for (int i = word.length(); i >= 0; i--) {
            for (int n = 0; n < i; n++) {
                counter = counter + countBalancedWords(word.substring(n, i));
            }
        }
        return counter;
    }

    private boolean isOnlyLetters(String word) {
        return word.matches("[a-zA-Z]+");
    }

    private int countBalancedWords(String word) {
        if (word.length() == 1) {
            return 1;
        }
        Map<Character, Integer> letterOccurrenceCounter = new HashMap<>();
        for (int i = word.length() - 1; i >= 0; i--) {
            if (letterOccurrenceCounter.containsKey(word.charAt(i))) {
                int count = letterOccurrenceCounter.get(word.charAt(i));
                letterOccurrenceCounter.put(word.charAt(i), ++count);
            } else {
                letterOccurrenceCounter.put(word.charAt(i), 1);
            }
        }
        Integer[] duplicateValues = letterOccurrenceCounter.values().toArray(new Integer[0]);
        for (int i = 0; i < duplicateValues.length - 1; i++) {
            if (!(duplicateValues[i].equals(duplicateValues[i + 1]))) {
                return 0;
            }
        }
        return 1;
    }
}
