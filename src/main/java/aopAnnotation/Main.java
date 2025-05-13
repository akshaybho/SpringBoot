package aopAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        BankTransactions bt = context.getBean(BankTransactions.class);

        bt.transactionUsingUpi();
        System.out.println();
        bt.transactionUsingMobileBanking();
        System.out.println();
        bt.transactionUsingInternetBanking();
    }
}
