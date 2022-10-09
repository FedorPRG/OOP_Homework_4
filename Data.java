import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Data {
    public class Main {
        public static void main(String[] args) {
     
            // Calendar calendar = new GregorianCalendar();
            // calendar.set(Calendar.YEAR, 2017);
            // calendar.set(Calendar.MONTH, 1);
            // calendar.set(Calendar.DAY_OF_MONTH, 25);
            // calendar.set(Calendar.HOUR_OF_DAY, 19);
            // calendar.set(Calendar.MINUTE, 42);
            // calendar.set(Calendar.SECOND, 12);
            // DateFormat df = new SimpleDateFormat("dd-MMM-yyy HH:mm:ss");
            // String c=df.format(calendar.getTime()).toString();
            // System.out.println(c);

            Calendar calendarNow = new GregorianCalendar();            
            DateFormat dfNow = new SimpleDateFormat("дата dd-MM-yyy время HH:mm:ss");
            String cNow=calendarNow.getTime().toString();
            dfNow.format(calendarNow.getTime());
            System.out.println(cNow);
            calendarNow.roll(Calendar.DATE, 10);
             cNow=calendarNow.getTime().toString();
            dfNow.format(calendarNow.getTime());
            System.out.println(cNow);

            // String strDate = "Sat, April 4, 2020";
            // SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
            // try {
            //     Date date = formatter.parse(strDate);
            //     System.out.println(date);
            //     System.out.println(formatter.format(date));
            //   }
            //   catch (ParseException e) {
            //     e.printStackTrace();
            //   }
              
            

        }
     }
}
