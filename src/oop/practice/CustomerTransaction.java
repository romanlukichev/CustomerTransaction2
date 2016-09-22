package oop.practice;

import java.util.Date;
import java.util.List;
/**
 * Created by Roman on 21.09.2016.
 */


//

public class CustomerTransaction implements Accounting, Reporting {
    ////////////////////////////////////////////////////////////////////////////////////

    private List<Product> products;
    private Customer customer;

    public CustomerTransaction(Customer customer , List<Product> products ){
        this.products = products;
        this.customer = customer;
    }

    // methods specific to reporting
    @Override
    public String getName(){
        return customer.getName();
    }

    @Override
    public Date getDate(){
        return new Date();
    }

    @Override
    public String productBreakdown(){
        String reportListing = "";
        for(Product product: products ){
            reportListing +=  product.getProductName();
        }
         return "List of products for reporting";
    }
     ///////////////////////////////////////////////////////////////////////////////////
    // Methods specific to the accountsReceivable
    @Override
    public void prepareInvoice(){
        System.out.println("invoice prepared ... ");
    }

    @Override
    public void chargeCustomer(){
        System.out.println("customer charged ... ");
    }
}
