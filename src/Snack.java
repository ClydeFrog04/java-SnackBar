public class Snack {

    private int id;
    private String name;
    private int quantity;
    private float cost;
    private int vendingID;

    public Snack(int id, String name, int quantity, float cost, int vendingID){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingID = vendingID;
    }
    public Snack(){}//just in case wee need it. Will probably remove later though

    //methods

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public void setVendingID(int vendingID) {
        this.vendingID = vendingID;
    }

    public int getVendingID() {
        return vendingID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public int buySnack(int quantityToBuy){
        //return codes: 0 = success, -1 = quantity desired higher than quantity available
        if(quantityToBuy > quantity){
            System.out.println("Quantity requested exceeds quantity available");
            return -1;
        }
        this.quantity -= quantityToBuy;
        return 0;
    }

    public float getTotalCost(int quantityToBuy){
        if (quantityToBuy <= 0) return 0;
        return quantityToBuy * cost;
    }
}
