import org.junit.Test;

import static org.junit.Assert.*;

public class RandomMonthNameTest {

    @Test
    public void displayMonthName() {
        int monthNumber = 9;
        String expected = "September";

        RandomMonth randomMonth = new RandomMonth();
        assertEquals("Failed to return month name", expected, randomMonth.displayMonthName(monthNumber));
    }

}