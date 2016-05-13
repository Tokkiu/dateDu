package date;

/**
 * Created by tokki on 16/4/7.
 */
public class dealWithYear {
    public static boolean isLeapYear(int year){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return true;
        }else {
            return false;
        }
    }
}
