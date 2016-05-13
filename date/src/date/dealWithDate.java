package date;
import date.Datetype;


import static date.dealWithMonth.getMonthType;
import static date.dealWithYear.isLeapYear;

/**
 * Created by tokki on 16/4/7.
 */
public class dealWithDate {



    public static int getDateType(Datetype date){
        int year = date.getYear();
        int month = date.getMonth();
        int day = date.getDay();
        int beginYear = 1800;
        int endYear  = 3000;
        boolean isCorrectYear = year>=beginYear&&year<=endYear;
        boolean isCorrectDay1 = (getMonthType(month)==1)&&(day>=1)&&(day<=31);
        boolean isCorrectDay2 = (getMonthType(month) == 2) && (day >=1 )&&(day <= 30);
        boolean isCorrectDay3 = isLeapYear(year)&&getMonthType(month)==3&&day>=1&&day<=29;
        boolean isCorrectDay4 = !isLeapYear(year)&&getMonthType(month)==3&&day>=1&&day<=28;
        if (isCorrectYear){
            if (isCorrectDay1){
                return 1;
            }else if (isCorrectDay2){
                return 2;
            }else if (isCorrectDay3){
                return 3;
            }else if (isCorrectDay4){
                return 4;
            }else return 0;
        }
        else return 0;
    }
}
