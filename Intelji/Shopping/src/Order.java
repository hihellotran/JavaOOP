import java.util.List;

public class Order {
     private Cart cart;
    private Customer customer;

    public Order(Cart cart, Customer customer){
        this.cart = cart;
        this.customer = customer;
    }
    public Cart getProducts() {
        return cart;
    }

    public void setProducts(Cart cart) {
        this.cart = cart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void XacNhan(){

        System.out.println("Khách hàng đặt: " + customer);
        System.out.println("Danh sách sản phẩm:");
        for (int i = 0; i < cart.getProducts().size(); i++) {
            System.out.println("\nTên sản phẩm: " + cart.getProducts().get(i).getSp_ten()
            + "\nSố lượng đặt : " + cart.getSl().get(i)+"\nGiá: " + cart.getProducts().get(i).getGia());
        }


    }

    @Override
    public String toString() {
        return "Order{" +
                "cart=" + cart +
                ", customer=" + customer +
                '}';
    }
}
