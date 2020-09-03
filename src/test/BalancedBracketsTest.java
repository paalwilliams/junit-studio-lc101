package test;

import org.junit.Test;

import javax.sql.rowset.BaseRowSet;

import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(false, hasBalancedBrackets("]"));
//    }

//    Test 1
    @Test
    public void openCloseBrackets() {
        assertEquals(true, hasBalancedBrackets("[]"));
    }

//    Test 2
    @Test
    public void closeOpenBrackets() {
        assertEquals(false, hasBalancedBrackets("]["));
    }

//    Test 3
    @Test
    public void oneOpenBracket() {
        assertEquals(false, hasBalancedBrackets("["));
    }

//    Test 4
    @Test
    public void oneCloseBracket() {
        assertEquals(false, hasBalancedBrackets("]"));
    }

//    Test 5
    @Test
    public void noBrackets() {
        assertEquals(false, hasBalancedBrackets("The quick brown fox jumps over the lazy dog"));
    }

//    Test 6
    @Test
    public void emptyString() {
        assertEquals(true, hasBalancedBrackets(""));
    }
//    Test 7
    @Test
    public void tripleOpenBrackets() {
        assertEquals(false, hasBalancedBrackets("[[["));
    }

//    Test 8
    @Test
    public void tripleCloseBrackets() {
        assertEquals(false, hasBalancedBrackets("]]]"));
    }

//    Test 8
    @Test
    public void multipleBalancedPairs() {
        assertEquals(true, hasBalancedBrackets("[][][][][][][][][]"));
    }
//    Test 9
    @Test
    public void multipleUnbalancedPairs() {
        assertEquals(false, hasBalancedBrackets("]]]][[[[[]]]][[][][][][][[[]][]["));
    }

//    Test 10
    @Test
    public void bracketString() {
        assertEquals(true, hasBalancedBrackets("Launch[code]"));
    }

//    Test 11
    @Test
    public void unbalancedBracketSring() {
        assertEquals(false, hasBalancedBrackets("Launch]code]"));
    }

//    Test 12
    @Test
    public void multipleUnbalancedBracketSring() {
        assertEquals(false, hasBalancedBrackets("Launch]code]]][]]CodeLau[fCnhoCode]"));
    }


}
