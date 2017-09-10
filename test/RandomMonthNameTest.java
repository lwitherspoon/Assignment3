import org.junit.Test;

import static org.junit.Assert.*;

public class RandomMonthNameTest {

    @Test
    public void displayMonthName() {
        int monthNumber = 9;
        String expected = "September";

        assertEquals("Failed to return month name", expected, RandomMonth.displayMonthName(monthNumber));
    }

    @Test
    public void randomInteger() {
        int lowerBound = 1;
        int upperBound = 12;
        int random = RandomMonth.randomInteger(lowerBound,upperBound);

        assertTrue("Error, random number is too low", random >= lowerBound);
        assertTrue("Error, random number is too high",  random <= upperBound);
    }

}