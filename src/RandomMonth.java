import java.util.Random;

/**
 * Program to randomly generate month name
 * @author Laura Witherspoon
 * Assignment 3.4
 * Date: 9/1/2017
 */

public class RandomMonth {

    /**
     * Generates a random number between min and max
     * @param min Minimum value of random number
     * @param max Maximum value of random number
     * @return An integer between the min and max inclusively
     */
    private static int randomInteger(int min, int max) {
        Random rand = new Random();
        return (rand.nextInt((max - min) + 1) + min);
    }

    static String displayMonthName(int monthNumber) {
        String monthName;

        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month number";
                break;
        }

        return monthName;
    }

    public static void main(String[] args) {
        int randomMonthNumber = randomInteger(1, 12);
        System.out.println(displayMonthName(randomMonthNumber));
    }
}
