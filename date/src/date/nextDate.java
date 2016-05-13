package date;
import date.dealWithDate.*;

import static date.dealWithDate.getDateType;

/**
 * Created by tokki on 16/4/7.
 */
public class nextDate {
    public static Datetype getNextDate(Datetype date){
        Datetype nextDate = new Datetype();
        int year=date.getYear();
        int month=date.getMonth();
        int day=date.getDay();
        if(getDateType(date) != 0) {
            if (getDateType(date) == 1) {
                if (day == 31) {
                    if (month == 12) {
                        nextDate.setYear(year + 1);
                        nextDate.setMonth(1);
                    } else {
                        nextDate.setYear(year);
                        nextDate.setMonth(month + 1);
                    }
                    nextDate.setDay(1);
                } else {
                    nextDate.setYear(year);
                    nextDate.setMonth(month);
                    nextDate.setDay(day + 1);
                }
            } else {
                nextDate.setYear(year);
                if (getDateType(date) == 2 && day == 30 ||
                        getDateType(date) == 3 && day == 29 ||
                        getDateType(date) == 4 && day == 28) {
                    nextDate.setMonth(month + 1);
                    nextDate.setDay(1);
                } else {
                    nextDate.setMonth(month);
                    nextDate.setDay(day + 1);
                }
            }
        }
        else{
            nextDate.setYear(0);
            nextDate.setMonth(0);
            nextDate.setDay(0);
        }
        //System.out.println(nextDate.getYear()+" "+nextDate.getMonth()+ " " +nextDate.getDay());
        return nextDate;
    }

}
