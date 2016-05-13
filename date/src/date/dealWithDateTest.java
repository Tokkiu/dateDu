package date;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tokki on 16/4/8.
 */
public class dealWithDateTest {

    @Test
    public void getDateType() throws Exception {
        int[][] date={
                {1804,1,1},{2400,5,29},{2988,8,30},{2996,12,31},
                {1800,2,28},{1801,2,29},{2001,2,30},{3000,2,31}
        };
        int[] expectedDate={
          1,1,1,1,4,0,0,0
        };
        for (int i = 0; i <date.length ; i++) {
            Datetype dateType=new Datetype();
            dateType.setYear(date[i][0]);
            dateType.setMonth(date[i][1]);
            dateType.setDay(date[i][2]);
            if (dealWithDate.getDateType(dateType)==expectedDate[i]){
                System.out.println(i+"right");
            }else {System.out.println(i+"wrong");}
//            assertEquals(dealWithDate.getDateType(dateType),expectedDate[i]);

        }
    }
}
