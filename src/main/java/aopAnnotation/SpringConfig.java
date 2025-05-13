package aopAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {

    @Bean
    public BankTransactions bankTrans()
    {
        return new BankTransactions();
    }

    @Bean
    public LoggingAspect logAspect()
    {
        return new LoggingAspect();
    }

}
