package date;

/**
 * Created by tokki on 16/4/7.
 */
public class dealWithMonth {
    public static int getMonthType(int month){
        switch (month){
            case 1:{return 1;}
            case 2:{return 3;}
            case 3:{return 1;}
            case 4:{return 2;}
            case 5:{return 1;}
            case 6:{return 2;}
            case 7:{return 1;}
            case 8:{return 1;}
            case 9:{return 2;}
            case 10:{return 1;}
            case 11:{return 2;}
            case 12:{return 1;}
            default:return 0;
        }
    }
}
