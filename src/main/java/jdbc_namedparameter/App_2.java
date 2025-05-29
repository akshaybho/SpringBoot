package jdbc_namedparameter;

import jdbc.SpringConfigNamedParameter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class App_2 {

    public static void main(String[] args) {

        Items item = new Items();
        item.setItemId(112);
        item.setItemName("Lehenga");
        item.setItemPrice(540);

        BeanPropertySqlParameterSource bp = new BeanPropertySqlParameterSource(item);

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigNamedParameter.class);

        NamedParameterJdbcTemplate np = context.getBean(NamedParameterJdbcTemplate.class);

        String sql_query = "INSERT INTO items VALUES(:itemId, :itemName, :itemPrice)";
        int count = np.update(sql_query, bp);
        if(count>0)
        {
            System.out.println("success");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
