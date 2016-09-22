package oop.practice;

/**
 * Created by Roman on 21.09.2016.
 */
public class AccountsReceivable {

    private Accounting transactionObject;
    // Without using interface it was: private CustomerTransaction transactionObject;

    // constructor
    public AccountsReceivable(Accounting aTransaction){
        transactionObject = aTransaction;
    }

    public void postPayment(){
        transactionObject.chargeCustomer();
    }

    public void sendInvoice(){
        transactionObject.prepareInvoice();
        // code that sends the invoice
    }
}
