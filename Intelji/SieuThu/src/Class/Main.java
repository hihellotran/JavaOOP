package Class;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("1", "milk",5.5,100);
        Product product2 = new Product("2", "water", 2.0, 200);
        Product product3 = new Product("3", "snack", 3.8, 150);
        Product product4 = new Product("4", "nodles", 1.3, 90);
        Product product5 = new Product("5", "egss", 0.5, 250);

        Customer customer1 = new Customer("pê đê", "123", "gò vấp");

        Purchase purchase = new Purchase();

        purchase.getProducts().add(product1);
        purchase.getProducts().add(product5);

        purchase.getDateCreated();



        Cashier cashier = new Cashier();
        cashier.insertBill(purchase, product3);


        System.out.println(purchase.getProducts());
        System.out.println(cashier.total(purchase));



    }
}