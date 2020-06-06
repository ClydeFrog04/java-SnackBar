public class Main {

    public static void main(String[] args) {
        //objects setup
        //customers
        Customer jane = new Customer(0, "Jane", 45.25f);
        Customer bob = new Customer(1, "Bob", 33.14f);
        //vending machines
        VendingMachine food = new VendingMachine(0, "Food");
        VendingMachine drink = new VendingMachine(1, "Drink");
        VendingMachine office = new VendingMachine(2, "Office");
        //snacks
        //public Snack(int id, String name, int quantity, float cost, int vendingID){
        Snack chips = new Snack(0, "Chips", 36, 1.75f, 0);
        Snack chocolateBar = new Snack(1, "Chocolate Bar", 36, 1.00f, 0);
        Snack pretzel = new Snack(2, "Pretzel", 30, 2.00f, 0);
        Snack soda = new Snack(3, "Soda", 24, 2.50f, 1);
        Snack water = new Snack(4, "Water", 20, 2.75f, 1);

        //processing
        jane.buyItem(soda.getTotalCost(3));
        System.out.println(jane.getCashOnHand());
        System.out.println(soda);

        jane.buyItem(pretzel.getTotalCost(1));
        System.out.println(jane.getCashOnHand());
        System.out.println(pretzel);

        bob.buyItem(soda.getTotalCost(2));
        System.out.println(bob.getCashOnHand());
        System.out.println(soda);

        jane.addCash(10f);
        System.out.println(jane.getCashOnHand());

        jane.buyItem(chocolateBar.getTotalCost(1));
        System.out.println(jane.getCashOnHand());
        System.out.println(chocolateBar);

        pretzel.addQuantity(12);
        System.out.println(pretzel);

        bob.buyItem(pretzel.getTotalCost(3));
        System.out.println(bob.getCashOnHand());
        System.out.println(pretzel);

    }
}