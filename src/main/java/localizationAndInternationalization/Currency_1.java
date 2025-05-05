package localizationAndInternationalization;

import java.util.Currency;
import java.util.Locale;

public class Currency_1 {

    public static void main(String[] args) {

        Locale locale_1 = Locale.getDefault();
        Currency currency = Currency.getInstance(locale_1);
        System.out.println(currency.getSymbol()+"-->"+currency.getDisplayName());

        Locale locale_2 = new Locale("fr", "FR");
        Currency currency2 = Currency.getInstance(locale_2);
        System.out.println(currency2.getSymbol()+"-->"+currency2.getDisplayName());
    }
}
