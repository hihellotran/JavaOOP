import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    private List<Integer> sl ;

    public Cart(){
        products = new ArrayList<>();
        sl = new ArrayList<>();
    }

    public  Cart(List<Product> products, List<Integer> sl){
        this.products = products;
        this.sl = sl;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Integer> getSl() {
        return sl;
    }

    public void setSl(List<Integer> sl) {
        this.sl = sl;
    }

    public double TongTien(){
        double sum = 0;
        for (int i = 0; i<products.size(); i++){
            sum+= sl.get(i) * products.get(i).getGia();

        }
        return sum;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + products +
                ", sl=" + sl +
                '}';
    }
}
