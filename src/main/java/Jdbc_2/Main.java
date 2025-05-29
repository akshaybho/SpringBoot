package Jdbc_2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcXML/applicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplateBean");

        try
        {
            Connection con = jdbcTemplate.getDataSource().getConnection();
            if(con != null)
            {
                System.out.println("success");
            }
            else
            {
                System.out.println("fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
