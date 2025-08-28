package edu.bsu.cs;

import org.junit.jupiter.api.Test;

public class LeapYearCalculatorTest {
    @Test
    public void is2024LeapYear()
    {
        FindLeapYear leapYear = new FindLeapYear();
        boolean result = leapYear.isLeapYear(2024);
        System.out.println("2024: " + result);
    }//end test

    @Test
    public void is2025LeapYear()
    {
        FindLeapYear leapYear = new FindLeapYear();
        boolean result = leapYear.isLeapYear(2025);
        System.out.println("2025: " + result);
    }//end test

    @Test
    public void is1900LeapYear()
    {
        FindLeapYear leapYear = new FindLeapYear();
        boolean result = leapYear.isLeapYear(1900);
        System.out.println("1900: " + result);
    }//end test

    @Test
    public void is1600LeapYear()
    {
        FindLeapYear leapYear = new FindLeapYear();
        boolean result = leapYear.isLeapYear(1600);
        System.out.println("1600: " + result);
    }//end test

    @Test
    public void is2000LeapYear()
    {
        FindLeapYear leapYear = new FindLeapYear();
        boolean result = leapYear.isLeapYear(2000);
        System.out.println("2000: " + result);
    }//end test

    @Test
    public void is12345LeapYear()
    {
        FindLeapYear leapYear = new FindLeapYear();
        boolean result = leapYear.isLeapYear(12345);
        System.out.println("12345: " + result);
    }//end test

    @Test
    public void is0LeapYear()
    {
        FindLeapYear leapYear = new FindLeapYear();
        boolean result = leapYear.isLeapYear(0);
        System.out.println("0: " + result);
    }//end test
    @Test
    public void is862LeapYear()
    {
        FindLeapYear leapYear = new FindLeapYear();
        boolean result = leapYear.isLeapYear(862);
        System.out.println("862: " + result);
    }

}//end class
