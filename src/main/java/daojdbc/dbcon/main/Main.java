package daojdbc.dbcon.main;

import daojdbc.dbcon.beans.ItemImpl;
import daojdbc.dbcon.product.Items;

public class Main {

    public static void main(String[] args) {

        Items i = new Items();
        i.setId(120);
        i.setItem("Bhari Shirt");
        i.setPrice(1225);

        ItemImpl il = new ItemImpl();
        boolean status = il.addDetails(i);

        if(status)
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
