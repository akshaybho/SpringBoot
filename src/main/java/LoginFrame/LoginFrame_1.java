package LoginFrame;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LoginFrame_1 {

    LoginFrame_1(String title, String email, String password, String button)
    {
        JFrame jf = new JFrame();
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);

        JLabel jl_login_title = new JLabel(title);
        jl_login_title.setBounds(250,50,100,50);
        jf.add(jl_login_title);

        JLabel jl_email_title = new JLabel(email);
        jl_email_title.setBounds(60,120,100,50);
        jf.add(jl_email_title);

        JTextField jt_email = new JTextField();
        jt_email.setBounds(60,170,300,40);
        jf.add(jt_email);

        JLabel jl_pass_title = new JLabel(password);
        jl_pass_title.setBounds(60,200, 100, 50);
        jf.add(jl_pass_title);

        JTextField jt_pass = new JTextField();
        jt_pass.setBounds(60,250,300,40);
        jf.add(jt_pass);

        JButton jb_login = new JButton(button);
        jb_login.setBounds(150,300,100,40);
        jf.add(jb_login);

        jf.setVisible(true);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. English - US");
        System.out.println("2. Hindi - India");
        System.out.println("=============================================");

        int no = sc.nextInt();
        switch(no)
        {
            case 1:
                LoginFrame_1.localeDetails("en", "US");
                break;

            case 2:
                LoginFrame_1.localeDetails("hi", "IN");
                break;

            default:
                System.out.println("Invalid Input");
        }
    }
    static void localeDetails(String languageCode, String countryCode)
    {
        Locale locale = new Locale(languageCode, countryCode);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("LoginFrame.Message", locale);
        String key_login_title = resourceBundle.getString("key_login_title");
        String key_email_title = resourceBundle.getString("key_email_title");
        String password_title = resourceBundle.getString("password_title");
        String login_button = resourceBundle.getString("login_button");

        new LoginFrame_1(key_login_title, key_email_title, password_title, login_button);
    }

}
