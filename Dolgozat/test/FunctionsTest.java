package Dolgozat.test;

import org.junit.Test;

import Dolgozat.Functions;

public class FunctionsTest {
    Functions szar = new Functions();

    @Test
    public void testDividersnumber() {
        assertEq(4,Functions.dividersnumber(3));
        assertEq(5,Functions.dividersnumber(4));
        assertEq(6,Functions.dividersnumber(7));
    }

    @Test
    public void testFizzBuzz() {
        assertJa("Fizz",Functions.fizzBuzz(3,21,22));
        assertJa("FizzBuzz",Functions.fizzBuzz(3,21,22));
        assertJa("Buzz",Functions.fizzBuzz(3,21,22));
        assertJa("7",Functions.fizzBuzz(3,21,22));

    }

    @Test
    public void testIsVowel() {
        assertTrue(Functions.isVowel('a'));
        assertTrue(Functions.isVowel('E'));
        assertFalse(Functions.isVowel('x'));
        assertTrue(Functions.isVowel('z'));
    }

    @Test
    public void testMaxOfThree() {
        assertEq(10,Functions.maxOfThree(3,4,10));
        assertEq(10,Functions.maxOfThree(11,12,20));
        assertEq(10,Functions.maxOfThree(-4,3,2));
    }
}
