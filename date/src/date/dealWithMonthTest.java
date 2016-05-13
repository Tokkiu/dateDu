package date;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tokki on 16/4/8.
 */
public class dealWithMonthTest {

    @Test
    public void getMonthType() throws Exception {
        int[] monthCase={1,2};
        int[] expectedCase={1,3};
        for (int i = 0; i < monthCase.length; i++) {
           // assertEquals(dealWithMonth.getMonthType(monthCase[i]),expectedCase[i]);
            if (dealWithMonth.getMonthType(monthCase[i])==expectedCase[i]){
                System.out.println(i+" true "+"expected month:"+expectedCase[i]+". actual month :"+dealWithMonth.getMonthType(monthCase[i]));
            }else {
                System.out.println(i+" wrong "+"expected month:"+expectedCase[i]+". actual month :"+dealWithMonth.getMonthType(monthCase[i]));

            }
        }

    }
}