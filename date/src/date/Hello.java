package date;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import java.io.BufferedWriter;



/**
 * Created by tokki on 16/3/24.
 */



public class Hello {

//    @test
//    public static void main() {
//        main();
//    }
//
//    @org.junit.test
    //public

    public static String nextDay(String sDate){



            SimpleDateFormat sformat = new SimpleDateFormat("yyyy-MM-dd");
            //取控制台输入
            //String sDate = reader.readLine();
            //
            Date date;
            try {
                date = sformat.parse(sDate);
            }
            catch (Exception e){
                 date = new Date();
            }
            Calendar c = Calendar.getInstance();

            c.setTime(date);
            //用Calendar工具类给日期加一天
            c.add(Calendar.DATE, 1);


        return sformat.format(c.getTime());
    }
    public static void main(String[] args) {
//        try {
//            File csv = new File("/Users/tokki/Desktop/ssss1.csv"); // CSV文件
//            File csvt = new File("/Users/tokki/Desktop/ssss2.csv");
//            BufferedReader br = new BufferedReader(new FileReader(csv));
//
//            String line = "";
//
//            while ((line = br.readLine()) != null) {
//
//                StringTokenizer st = new StringTokenizer(line, ",");
//
//                while (st.hasMoreTokens()) {
//
//                   String sDate=st.nextToken();
//                    System.out.println(nextDay(sDate));
////                    //String sDate="2077-08-09";
////                    SimpleDateFormat sformat = new SimpleDateFormat("yyyy-MM-dd");
////                    //取控制台输入
////                    //String sDate = reader.readLine();
////                    //解析日期
////                    Date date = sformat.parse(sDate);
////                    Calendar c = Calendar.getInstance();
////
////                    c.setTime(date);
////                    //用Calendar工具类给日期加一天
////                    c.add(Calendar.DATE, 1);
////                    BufferedWriter bw=new BufferedWriter(new FileWriter(csvt,true));
////                    bw.newLine();
////                    bw.write(sDate+','+sformat.format(c.getTime()));
////                    bw.close();
////                    System.out.println(sDate+"下一天为:" + sformat.format(c.getTime()));
//                }
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.err.println("输入日期异常");
//        } catch (ParseException e) {
//            e.printStackTrace();
//            System.err.println("不能解析的日期格式");
//        }

    }





}

