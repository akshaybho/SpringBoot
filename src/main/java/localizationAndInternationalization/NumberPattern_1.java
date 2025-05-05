package localizationAndInternationalization;

import java.text.DecimalFormat;

public class NumberPattern_1 {

    public static void main(String[] args) {

        int n1 = 123456789;
        double n2 = 9846.32157;

        String pattern = "##,##,##.####";

        DecimalFormat dm1 = new DecimalFormat(pattern);
        System.out.println(dm1.format(n1));
        System.out.println(dm1.format(n2));
    }
}
