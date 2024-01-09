package Interface;

import java.util.List;
import Class.*;

public interface Inventory {
    public abstract void insertProduct(List<Product> warehouse, Product product);
    public abstract void deleteProduct(List<Product> warehouse, Product product);
    public abstract void updateProduct(List<Product> warehouse, Product product);
}
