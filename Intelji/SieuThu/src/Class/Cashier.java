package Class;

import Interface.Shopable;

public class Cashier extends Customer implements Shopable {

    @Override
    public void insertBill(Purchase purchase, Product product) {
        purchase.getProducts().add(product);
        System.out.println(product.getName());
    }

    @Override
    public void deleteBill(Purchase purchase, Product product) {
        purchase.getProducts().remove(product);
    }

    @Override
    public Double total(Purchase purchase) {
        Double sum = 0.0;
//        for(int i = 0; i<purchase.getProducts().size(); i++){
//            sum+=purchase.getProducts().get(i).getPrice() *
//                    purchase.getProducts().get(i).getQuantity();
//        }

        for (Product product : purchase.getProducts()) {
            sum += product.getPrice() * product.getQuantity();
            System.out.println(product.getPrice() + " " + product.getQuantity());
        }
        return sum;
    }

    @Override
    public void insertBill(Purchase purchase, String productName) {
        Product product = new Product();
        product.setName(productName);
        purchase.getProducts().add(product);
    }
}
