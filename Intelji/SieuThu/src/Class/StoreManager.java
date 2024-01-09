package Class;

import Interface.Inventory;

import java.util.List;

public class StoreManager extends Customer implements Inventory {

    @Override
    public void insertProduct(List<Product> warehouse, Product product) {
        warehouse.add(product);
    }

    @Override
    public void deleteProduct(List<Product> warehouse, Product product) {
        for ( Product producting : warehouse){ // sản phẩm đang xét
            if (producting.getId().equals(product.getId())){
                warehouse.remove(producting);
            }
        }
    }

    @Override
    public void updateProduct(List<Product> warehouse, Product product) {
        for(int i = 0; i< warehouse.size(); i++){
            if (warehouse.get(i).getId().equals(product.getId())){
                warehouse.get(i).setName(product.getName());
                warehouse.get(i).setPrice(product.getPrice());
                warehouse.get(i).setQuantity(product.getQuantity());
            }
        }
    }
}
