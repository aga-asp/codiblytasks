package com.example.codiblytasks.taskone;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BubbleSort {
    public List<Comparable> sort(List<Comparable> input) {
        if (input != null) {
            if (input.isEmpty()) {
                return input;
            }
            if (input.stream()
                    .anyMatch(Objects::isNull)) {
                input = removeNullValues(input);
            }
            bubbleSortValues(input);
            return input;

        }
        throw new RuntimeException();
    }

    private List<Comparable> removeNullValues(List<Comparable> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .toList();

    }

    private void bubbleSortValues(List<Comparable> list) {
        int lastValueIndex = list.size() - 1;
        for (int n = lastValueIndex; n >= 0; n--) {
            for (int i = 0; i < n; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    Collections.swap(list, i, i + 1);
                }
            }
        }
    }
}

