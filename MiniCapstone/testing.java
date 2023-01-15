import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Animal {

    Date getYesterday() { 

        return new Date(System.currentTimeMillis() - 86400000);

    }
    

}

public class testing  {

    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");

        long date = System.currentTimeMillis();
        Date todaysYear = new Date(date);

        String year = formatter.format(todaysYear) + "0";

        System.out.println(year);

    }

 
}
