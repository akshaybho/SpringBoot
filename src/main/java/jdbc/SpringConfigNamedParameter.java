package jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SpringConfigNamedParameter {

    @Bean
    public DriverManagerDataSource myDataSource()
    {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/student");
        dataSource.setUsername("root");
        dataSource.setPassword("Aksh@115");

        return dataSource;
    }

    @Bean
    public NamedParameterJdbcTemplate myNpJdbcTemplate()
    {
        NamedParameterJdbcTemplate np = new NamedParameterJdbcTemplate(myDataSource());

        return np;
    }


}
