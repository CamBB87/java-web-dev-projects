package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void charactersWithinBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void charactersWithinAndOutBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void bracketsWithoutCharactersInside() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Pools"));
    }
    @Test
    public void withoutBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void onlyStartingBracketAndCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void bracketsOutOFOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void onlyHasOneBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void hasTheRightBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}
