package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("aop/aopApplicationContext.xml");

        BankTransaction bt = (BankTransaction)context.getBean("bankTransId");

        bt.transactionUsingUpi();
        System.out.println();

        bt.transactionUsingMobileBanking();
        System.out.println();

        bt.transactionUsingInternetBanking();
        System.out.println();
    }
}
