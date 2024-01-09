import java.util.List;

public class Customer {
    private String ten;
    private String dia_chi;
    private String sdth;

    public Customer(String ten, String dia_chi, String sdth){
        this.ten = ten;
        this.dia_chi = dia_chi;
        this.sdth = sdth;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getSdth() {
        return sdth;
    }

    public void setSdth(String sdth) {
        this.sdth = sdth;
    }


    public void AddProduct(Cart cart, Product product, int sl){
        cart.getProducts().add(product);
        cart.getSl().add(sl);
    }

    public void DisplayCart(Cart cart){
        System.out.println(cart.toString());
    }


    public Order OrderProduct(Cart cart){
        //đơn đặt hàng cần có những thông tin : danh sách sản phẩm, thông tin
        //khách  hàng

        Order order = new Order(cart,this );

        return order;
    }

    public void ProductHistory(Order order){
        System.out.println(order.toString());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ten='" + ten + '\'' +
                ", dia_chi='" + dia_chi + '\'' +
                ", sdth='" + sdth + '\'' +
                '}';
    }
}
