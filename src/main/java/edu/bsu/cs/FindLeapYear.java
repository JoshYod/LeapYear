package edu.bsu.cs;

public class FindLeapYear {
    private int year;

    public boolean isLeapYear(int year) {
        if (((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0))) {
            return true;
        }
        else{
            return false;
        }
        /*boolean result;
        if (year % 400 == 0){
            result = true;
        }
        else if (year % 100 == 0){
            result = false;
        }
        else if(year % 4 == 0){
            result = true;
        }
        else{
            result = false;
        }
        return result;*/
    }//end isLeapYear
}// end class
