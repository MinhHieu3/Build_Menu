package sevices;

import models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ManagerProduct implements IManager<Product ,Integer> {
    List<Product> productList=new ArrayList<>();
    public ManagerProduct() {
        productList.add(new Product(1,"Bim Bim",1000,10));
        productList.add(new Product(2,"Mì Tôm",4000,20));
        productList.add(new Product(3,"gà",5000,5));
        productList.add(new Product(4,"Kẹo",4000,20));
        productList.add(new Product(5,"Tôm",4000,20));
        productList.add(new Product(6,"Bút Bi",4000,20));
        productList.add(new Product(7,"Chuột",4000,20));
        productList.add(new Product(8,"Sạc",4000,20));
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }


    @Override
    public void showAll() {
        for (Product p:productList) {
            System.out.println(p);
        }
    }

    @Override
    public void edit(int n, Product edit) {


    }

    @Override
    public void delete(int id) {
        productList.removeIf(p -> p.getId() == id);

    }

    @Override
    public Product search(Integer id) {
        for (Product p:productList) {
            if (id == p.getId()) {
                return p;
            }
        }
        return null;
    }
}
