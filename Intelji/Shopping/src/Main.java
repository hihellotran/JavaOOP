import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Bánh mì", "Bột mì", 3500, 100);
        Product product2 = new Product("Sữa", "bò", 55000, 150);
        Product product3 = new Product("Gạo", "kg", 18000, 1000);


//        List<Product> products = new ArrayList<>();
//        products.add(product1);
//        products.add(product2);
//        products.add(product3);

        Customer customer = new Customer("a","hcm", "123");
        Cart cart = new Cart();
        customer.AddProduct(cart,product1, 2);

        customer.AddProduct(cart,product2, 3);
        //in giỏ hàng
        System.out.println(cart.toString());

        // sau khi chọn sản phẩm và số lượng thì khách hàng thanh toán (order)
        // khách hàng cần order sản phẩm
        Order order = customer.OrderProduct(cart);
        System.out.println(order.toString());

        System.out.println(cart.TongTien());
        order.XacNhan();

        
    }
}