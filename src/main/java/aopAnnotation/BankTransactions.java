package aopAnnotation;

public class BankTransactions {

    public void transactionUsingUpi()
    {
        System.out.println("=====business logic for UPI transaction=====");
    }

    public void transactionUsingMobileBanking()
    {
        System.out.println("====== business logic for mobile banking transaction ======");
    }

    public void transactionUsingInternetBanking()
    {
        System.out.println("===== business logic for Internet Banking Transaction ======");
    }
}
