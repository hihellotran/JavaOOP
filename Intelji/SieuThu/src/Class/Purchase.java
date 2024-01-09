package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Purchase {
    private List<Product> products;
    private Date dateCreated;

    public Purchase() {
        products = new ArrayList<>();
        dateCreated = new Date();
    }

    public Purchase(List<Product> products, Date dateCreated) {
        this.products = products;
        this.dateCreated = dateCreated;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Class.Purchase{" +
                "products=" + products +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
