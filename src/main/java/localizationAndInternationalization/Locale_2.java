package localizationAndInternationalization;

import java.util.Locale;

public class Locale_2 {

    public static void main(String[] args) {

        String []countries = Locale.getISOCountries();

        // get name of countries from countryCodes
        for(String data : countries)
        {
            Locale locale = new Locale("", data);
            System.out.println(data+"-------->"+locale.getDisplayCountry());
        }

        String []languageCode = Locale.getISOLanguages();

        for(String info : languageCode)
        {
            Locale locale = new Locale(info);
            System.out.println(info+"-------->"+locale.getDisplayLanguage());
        }

    }
}
