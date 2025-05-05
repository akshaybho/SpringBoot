package localizationAndInternationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTime {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);

        System.out.println("====Below is Indian Format====");
        Locale locale_1 = new Locale("en", "IN");
        DateFormat df1 = DateFormat.getDateInstance(0, locale_1);
        System.out.println(df1.format(date));
    }
}
