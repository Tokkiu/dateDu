package date;
import date.nextDate.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by tokki on 16/4/7.
 */
public class nextDateTest {

    @Test
    public void getNextDate() throws Exception {

        int[][] correntDates1 = {
                {1804,2,28},{1808,2,29},{2400,2,30},{2996,2,31},
                {1808,4,15},{2000,6,29},{2992,9,30},{2996,11,31},
                {1804,1,1},{2400,5,29},{2988,8,30},{2996,12,31},
                {1800,2,28},{1801,2,29},{2001,2,30},{3000,2,31},
                {1802,4,28},{2002,6,29},{2401,9,30},{2999,11,31},
                {1803,1,28},{2003,7,29},{2402,10,30},{2998,12,31},
                {2016,4,0},{2015,5,32},{2016,0,25},{2014,13,15},{1799,4,25},{3001,6,15}
        };
        int[][] correntDates2 = {
                {1799,6,15},{1800,5,16},{1801,7,24},{2400,8,14},{2999,6,18},{3000,8,13},
                {3001,7,12},{2400,0,14},{2401,1,17},{2403,2,15},{2400,11,15},{2399,12,15},
                {2398,13,15},{2400,6,0},{2401,7,1},{2399,8,2},{2300,7,29},{2400,8,30},{2400,5,31}
        };
        int[][] nextDates1 = {
                {1804,2,29},{1808,3,1},{0,0,0},{0,0,0},
                {1808,4,16},{2000,6,30},{2992,10,1},{0,0,0},
                {1804,1,2},{2400,5,30},{2988,8,31},{2997,1,1},
                {1800,3,1},{0,0,0},{0,0,0},{0,0,0},
                {1802,4,29},{2002,6,30},{2401,10,1},{0,0,0},
                {1803,1,29},{2003,7,30},{2402,10,31},{2999,1,1},
                {0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0}

        };
        int[][] nextDates2={
                {0,0,0},{1800,5,17},{1801,7,25},{2400,8,15},{2999,6,19},{3000,8,14},
                {0,0,0},{0,0,0},{2401,1,18},{2403,2,16},{2400,11,16},{2399,12,16},
                {0,0,0},{0,0,0},{2401,7,2},{2399,8,3},{2300,7,30},{2400,8,31},{2400,6,1}
        };
        for(int i = 0 ;i  <correntDates1.length;i++)
            {
                Datetype correntDate = new Datetype();
                correntDate.setYear(correntDates1[i][0]);
                correntDate.setMonth(correntDates1[i][1]);
                correntDate.setDay(correntDates1[i][2]);
                if (nextDates1[i][0]==nextDate.getNextDate(correntDate).getYear()){
                    System.out.println(i+" year is true"+". expected year: "+nextDates1[i][0]+". actual year :"+nextDate.getNextDate(correntDate).getYear());
                }else{
                    System.out.println(i+" year is wrong"+". expected year: "+nextDates1[i][0]+". actual year :"+nextDate.getNextDate(correntDate).getYear());

                }

                if (nextDates1[i][1]==nextDate.getNextDate(correntDate).getMonth()){
                    System.out.println(i+" month is true"+". expected month :"+nextDates1[i][1]+". actual month :"+nextDate.getNextDate(correntDate).getMonth());
                }else{
                    System.out.println(i+" month is wrong"+". expected month :"+nextDates1[i][1]+". actual month :"+nextDate.getNextDate(correntDate).getMonth());

                }

                if (nextDates1[i][2]==nextDate.getNextDate(correntDate).getDay()){
                    System.out.println(i+" day is true"+". expected day :"+nextDates1[i][2]+". actual day :"+nextDate.getNextDate(correntDate).getDay());
                }else{
                    System.out.println(i+" day is wrong"+". expected day :"+nextDates1[i][2]+". actual day :"+nextDate.getNextDate(correntDate).getDay());

                }

                //assertEquals(nextDates1[i][0],nextDate.getNextDate(correntDate).getYear());
                //assertEquals(nextDates1[i][1],nextDate.getNextDate(correntDate).getMonth());
                //assertEquals(nextDates1[i][2],nextDate.getNextDate(correntDate).getDay());

            }

//        for(int i = 0 ;i  <correntDates2.length;i++)
//        {
//            Datetype correntDate = new Datetype();
//            correntDate.setYear(correntDates2[i][0]);
//            correntDate.setMonth(correntDates2[i][1]);
//            correntDate.setDay(correntDates2[i][2]);
//            assertEquals(nextDates2[i][0],nextDate.getNextDate(correntDate).getYear());
//            assertEquals(nextDates2[i][1],nextDate.getNextDate(correntDate).getMonth());
//            assertEquals(nextDates2[i][2],nextDate.getNextDate(correntDate).getDay());
//
//        }
    }

    @Test
    public void main() throws Exception {

    }
}