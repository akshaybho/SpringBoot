package localizationAndInternationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_1 {

    public static void main(String[] args) {

        int n1 = 123456789;
        double n2 = 98765.43210;

        System.out.println("--------Below is Indian Format---------");

        Locale locale1 = Locale.getDefault();

        NumberFormat nf1 = NumberFormat.getInstance(locale1);

        System.out.println(nf1.format(n1));
        System.out.println(nf1.format(n2));

        System.out.println("--------Below is France Format---------");

        Locale locale2 = new Locale("fr", "FR");

        NumberFormat nf2 = NumberFormat.getInstance(locale2);

        System.out.println(nf2.format(n1));
        System.out.println(nf2.format(n2));
    }
}
