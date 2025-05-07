package Resource;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcseBumdle_1 {

    public static void main(String[] args) {

        Locale locale = new Locale("hi", "IN");

        ResourceBundle resourceBundle = ResourceBundle.getBundle("Resource.MessageBundle", locale);

        String msg = resourceBundle.getString("key_greet");

        System.out.println(msg);
    }
}
