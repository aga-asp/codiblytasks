package com.example.codiblytasks.taskone;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void shouldThrowRunTimeExceptionWhenInputIsNull() {
        //given
        BubbleSort bubbleSort = new BubbleSort();
        //when then
        assertThrows(RuntimeException.class, () -> bubbleSort.sort(null));
    }

    @Test
    void shouldReturnEmptyListWhenInputIsEmpty() {
        //given
        List<Comparable> givenList1 = List.of();
        List<Comparable> expectedSortedList1 = List.of();
        BubbleSort bubbleSort = new BubbleSort();
        //when
        List<Comparable> actualResponse1 = bubbleSort.sort(givenList1);
        //then
        assertEquals(expectedSortedList1, actualResponse1);
    }

    @Test
    void shouldReturnSortedList() {
        //given
        List<Comparable> givenList1 = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        List<Comparable> givenList2 = Arrays.asList(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0);
        List<Comparable> expectedSortedList1 = Arrays.asList(1, 3, 4, 5, 6, 8, 8);
        List<Comparable> expectedSortedList2 = Arrays.asList(-9.3, 0.1, 0.2, 4.0, 5.0, 9.0);
        BubbleSort bubbleSort = new BubbleSort();

        //when
        List<Comparable> actualResponse1 = bubbleSort.sort(givenList1);
        List<Comparable> actualResponse2 = bubbleSort.sort(givenList2);

        //then
        assertEquals(expectedSortedList1, actualResponse1);
        assertEquals(expectedSortedList2, actualResponse2);

    }

    @Test
    void shouldReturnSortedListWhenThereAreNullObjects() {
        //given
        List<Comparable> givenList1 = Arrays.asList(null, 5.0001);
        List<Comparable> expectedSortedList1 = Arrays.asList(5.0001);
        BubbleSort bubbleSort = new BubbleSort();
        //when
        List<Comparable> actualResponse1 = bubbleSort.sort(givenList1);
        //then
        assertEquals(expectedSortedList1, actualResponse1);
    }


}