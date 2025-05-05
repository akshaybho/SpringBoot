package localizationAndInternationalization;

import java.util.Locale;

public class Locale_3 {

    public static void main(String[] args) {

        Locale myLocale = Locale.JAPANESE;
        String []countryCode = Locale.getISOCountries();

        for(String data : countryCode)
        {
            Locale locale = new Locale("", data);
            System.out.println(data+"-->"+locale.getDisplayCountry()+"-->"+locale.getDisplayCountry(myLocale));
        }
    }
}
