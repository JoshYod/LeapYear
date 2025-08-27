package edu.bsu.cs;

import org.junit.jupiter.api.Test;

public class LeapYearCalculatorTest {
    @Test
    public void is2024LeapYear()
    {
        FindLeapYear leapYear = new FindLeapYear();
        boolean result = leapYear.isLeapYear(2024);
        System.out.println(result);
    }//end is2024Leapyear
    @Test
    public void is2025LeapYear()
    {
        FindLeapYear leapYear = new FindLeapYear();
        boolean result = leapYear.isLeapYear(2025);
        System.out.println(result);
    }
}//end class
