package jdbc_namedparameter;

import jdbc.SpringConfigNamedParameter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class App_1 {

    public static void main(String[] args) {

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("key_id", 111);
        params.addValue("key_name", "coat-pent");
        params.addValue("key_price", 8999);

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigNamedParameter.class);

        NamedParameterJdbcTemplate np = context.getBean(NamedParameterJdbcTemplate.class);

        String sql_query = "INSERT INTO items VALUES(:key_id, :key_name, :key_price)";
        int count = np.update(sql_query, params);
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

