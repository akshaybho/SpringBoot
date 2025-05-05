package localizationAndInternationalization;

import java.util.Locale;

public class Local_1 {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();

        System.out.println("Default locale : "+locale);
        System.out.println("Country Name : "+locale.getDisplayCountry());
        System.out.println("Country code : "+locale.getCountry());
        System.out.println("Country language : "+locale.getDisplayLanguage());
        System.out.println("Language code : "+locale.getLanguage());

        System.out.println("----------------------------------------------------------------------------------");

        Locale locale2 = new Locale("fr", "FR");
        System.out.println("Default locale : "+locale2);
        System.out.println("Country Name : "+locale2.getDisplayCountry());
        System.out.println("Country code : "+locale2.getCountry());
        System.out.println("Country language : "+locale2.getDisplayLanguage());
        System.out.println("Language code : "+locale2.getLanguage());
    }


}
