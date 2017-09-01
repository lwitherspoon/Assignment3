/**
 * Program to randomly generate month name
 * @author Laura Witherspoon
 * Assignment 3.4
 * Date: 9/1/2017
 */

public class RandomMonth {

    // Generate random number between 1 and 12
    private static int monthNumber = (int)(Math.random() * 12 + 1);

    public static void main(String[] args) {

        String monthName;

        // Display month name based on number generated
        switch (monthNumber) {
            case 1: monthName = "January";
                    break;
            case 2: monthName = "February";
                    break;
            case 3: monthName = "March";
                    break;
            case 4: monthName = "April";
                    break;
            case 5: monthName = "May";
                    break;
            case 6: monthName = "June";
                    break;
            case 7: monthName = "July";
                    break;
            case 8: monthName = "August";
                    break;
            case 9: monthName = "September";
                    break;
            case 10: monthName = "October";
                    break;
            case 11: monthName = "November";
                    break;
            case 12: monthName = "December";
                    break;
            default: monthName = "Invalid month number";
                    break;
        }
        System.out.println(monthName);

    }
}
