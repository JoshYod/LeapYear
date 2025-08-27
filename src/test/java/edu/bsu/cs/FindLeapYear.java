package edu.bsu.cs;

public class FindLeapYear {
    private int year;

    public boolean isLeapYear(int year) {
        boolean result;
        if(year % 4 == 0){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }//end isLeapYear
}// end class
