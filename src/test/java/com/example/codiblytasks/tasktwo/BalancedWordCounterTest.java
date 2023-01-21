package com.example.codiblytasks.tasktwo;

import com.example.codiblytasks.taskone.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BalancedWordCounterTest {

    @Test
    void shouldCountBalancedWords() {
        //given
        var givenInput = "aabbabcccba" ;
        var expectedNumberOfBalancedWords = 28;
        BalancedWordCounter balancedWordCounter = new BalancedWordCounter();
        //when
        var actualResponse1 = balancedWordCounter.count(givenInput);
        //then
        assertEquals(expectedNumberOfBalancedWords, actualResponse1);
    }
    @Test
    void shouldReturnZeroWhenInputIsEmpty() {
        //given
        var givenInput = "" ;
        var expectedNumberOfBalancedWords = 0;
        BalancedWordCounter balancedWordCounter = new BalancedWordCounter();
        //when
        var actualResponse1 = balancedWordCounter.count(givenInput);
        //then
        assertEquals(expectedNumberOfBalancedWords, actualResponse1);
    }
    @Test
    void shouldThrowRunTimeExceptionWhenInputIsNull() {
        //given
        BalancedWordCounter balancedWordCounter = new BalancedWordCounter();
        //when then
        assertThrows(RuntimeException.class, () -> balancedWordCounter.count(null));
    }
    @Test
    void shouldThrowRunTimeExceptionWhenInputHasNonLetters() {
        //given
        var givenInput = "abababa1" ;
        BalancedWordCounter balancedWordCounter = new BalancedWordCounter();
        //when then
        assertThrows(RuntimeException.class, () -> balancedWordCounter.count(givenInput));
    }
}