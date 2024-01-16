package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }

    /**
     * Unit Test to prove that given test returns 7 with provided string
     */
    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }

    /**
     * Unit Test to prove that given test returns 2 with provided string
     */
    @Test
    public void testCountNumbers2() {
        mycustomstring.setString("My custom string has exactly two numbers which are 10 and 20");
        assertEquals(2,mycustomstring.countNumbers());
    }

    /**
     * Unit Test to prove that given test returns 0 when string is empty
     */
    @Test
    public void testCountNumbers3() {
        mycustomstring.setString(" ");
        assertEquals(0, mycustomstring.countNumbers());
    }

    /**
     * Unit Test to prove that given test returns NullPointerException when provided string is null
     */

    @Test(expected = NullPointerException.class)
    public void testCountNumbers4() {
        tearDown();
        mycustomstring.countNumbers();
    }

    /**
     * Unit Test to prove that given test returns 0 with provided string has no digit
     */
    @Test
    public void testCountNumbers5() {
        mycustomstring.setString("This string does not have any digit");
        assertEquals(0, mycustomstring.countNumbers());
    }

    /**
     * Unit Test to prove that given test returns 5 with provided string
     */
    @Test
    public void testCountNumbers6() {
        mycustomstring.setString("I have 1-2-1 relationship in my 4x4 trucks database");
        assertEquals(5, mycustomstring.countNumbers());
    }

    /**
     * Unit Test to prove that given test returns I'd b3tt3r put s0me d161ts in this 5tr1n6, right? with provided string
     */
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false));
    }

    /**
     * Unit Test to prove that given test returns Idbt3 u 0ed6t nti t16 ih with provided string
     */

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("Idbt3 u 0ed6t nti t16 ih", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    /**
     * Unit Test to prove that given test returns d33p md1  i51,it with provided string
     */

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    /**
     * Unit Test to prove that given test returns dt  e6 t 1 h ,it with provided string
     */

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("dt  e6 t 1 h", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(4, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("br  t  ni", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("3pm1 5,t", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(6, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("3u  s6t", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(7, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("ts1hnt", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(8, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("t0s r", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(9, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("3en1", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(10, true));
    }

    /**
     * Unit Test to prove that given test throws exception of NullPointerException with provided string
     */

    @Test(expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        tearDown();
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(10, false);
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(" 6 h", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(12, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("ptr", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(13, true));
    }

    /**
     * Unit Test to prove that given test throws exception of IllegalArgumentException with provided string
     * Since max bound is not in range
     */

    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1000, false);
    }

    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }

    /**
     * Unit Test to prove that given test throws exception of IllegalArgumentException with provided string
     * Since startPosition is greater than endPosition
     */

    @Test ( expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring2() {
        mycustomstring.setString("IllegalArgumentException");
        mycustomstring.convertDigitsToNamesInSubstring(70,35);
    }

    /**
     * Unit Test to prove that given test throws exception of MyIndexOutOfBoundsException with provided string
     * Since startPosition is less than 1
     */

    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring3() {
        mycustomstring.setString("MyIndexOutOfBoundsException LowerBound Test: LowerBound = 0 and UpperBound = 100");
        mycustomstring.convertDigitsToNamesInSubstring(0,10);
    }

    /**
     * Unit Test to prove that given test throws exception of MyIndexOutOfBoundsException with provided string
     * Since endPosition is greater than actual length of a string
     */

    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring4() {
        mycustomstring.setString("MyIndexOutOfBoundsException UpperBound Test: LowerBound = 1 and UpperBound = 100");
        mycustomstring.convertDigitsToNamesInSubstring(1,100);
    }

    /**
     * Unit Test to prove that given test throws exception of NullPointerException with provided string
     * Since startPosition and endPosition are greater than 0 but string is null
     */

    @Test(expected = NullPointerException.class)
    public void testConvertDigitsToNamesInSubstring5() {
        mycustomstring.setString("MyIndexOutOfBoundsException NULL String Test: LowerBound = 1 and UpperBound = 50");
        tearDown();
        mycustomstring.convertDigitsToNamesInSubstring(1,50);
    }

    @Test
    public void testConvertDigitsToNamesInSubstring6() {
        mycustomstring.setString("MyIndexOutOfBoundsException: LowerBound = 1 and UpperBound = 50");
        mycustomstring.convertDigitsToNamesInSubstring(1,63);
        assertEquals("MyIndexOutOfBoundsException: LowerBound = One and UpperBound = FiveZero",mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring7() {

       mycustomstring.setString("8008888888");
       mycustomstring.convertDigitsToNamesInSubstring(1,mycustomstring.getString().length());
       assertEquals("EightZeroZeroEightEightEightEightEightEightEight",mycustomstring.getString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring8() {
        mycustomstring.setString("89097jujki89");
        mycustomstring.convertDigitsToNamesInSubstring(10,1);
    }

}
