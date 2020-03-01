/*
Customer has id, name, cash on hand.
Customer can add cash, buy given total cash used in purchase, get and set name, get cash on hand.
 */
public class Customer {

    private int id;
    private String name;
    private float cashOnHand;

    public Customer(int id, String name, float cashOnHand){
        this.id = id;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }


}
