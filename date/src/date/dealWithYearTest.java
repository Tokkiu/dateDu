package date;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tokki on 16/4/8.
 */
public class dealWithYearTest {

    @Test
    public void isLeapYear() throws Exception {
        int[] yearType={1800,1801,2400,2401,2999,3000,2000,2001};
        boolean[] expectedType={false,false,true,false,false,false,true,false};
        for (int i=0;i<=yearType.length;i++){
           // assertEquals(dealWithYear.isLeapYear(yearType[i]),expectedType[i]);
            if (dealWithYear.isLeapYear(yearType[i])){
                if (expectedType[i]){
                    System.out.println(i+"is leap");
                }else {
                    System.out.println(i+"wrong");
                }
            }else {
                if (expectedType[i]){System.out.println(i+"wrong");}
                else {System.out.println(i+"is not leap");}
            }
        }
    }
}