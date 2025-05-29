package jdbc_namedparameter;

import jdbc.SpringConfigNamedParameter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Map <String, Object> map = new HashMap<>();
        map.put("key_id", 110);
        map.put("key_name", "Boss");
        map.put("key_price", 1199);

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigNamedParameter.class);

        NamedParameterJdbcTemplate np = context.getBean(NamedParameterJdbcTemplate.class);

        String sql_query = "INSERT INTO items VALUES(:key_id, :key_name, :key_price)";
        int count = np.update(sql_query, map);
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
