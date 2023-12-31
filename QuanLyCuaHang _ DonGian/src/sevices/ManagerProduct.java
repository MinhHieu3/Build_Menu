package sevices;

import models.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ManagerProduct  implements IManager<Product,String>{
    List<Product> productList=new ArrayList<>();
    List<String> list= new ArrayList<>();
    LocalDateTime currentTime = LocalDateTime.now();
    public ManagerProduct() {
        productList.add(new Product(1,"Bim Bim",1000,10));
        productList.add(new Product(2,"Mì Tôm",4000,20));
        productList.add(new Product(3,"gà",5000,1));
        productList.add(new Product(4,"Kẹo",4000,20));
        productList.add(new Product(5,"Tôm",4000,20));
        productList.add(new Product(6,"Bút Bi",4000,20));
        productList.add(new Product(7,"Chuột",4000,4));
        productList.add(new Product(8,"Sạc",4000,0));
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
    public void delete(int delelte) {

    }

    @Override
    public Product search(String name) {
        for (Product p:productList) {
            if (p.getName().equals(name)){
                System.out.println(p);
            }
        }
        return null;
    }
    public void searchQuantily(){
        for (Product p:productList) {
            if (p.getQuantity()>0){
                System.out.println(p);
            } else if (p.getQuantity()==0) {
                System.out.println(p+ "Hết Hàng");
            }
        }
    }
    public void check(int id, int sl, String namePeople){
        for (Product p:productList) {
            int i,money;
            if (p.getQuantity()>0&&p.getId()==id&&p.getQuantity()>=sl){
                 i= p.getQuantity() - sl;
                     money = p.getPrice() * sl;
                     list.add("Tên Khách Hàng: \n" + namePeople + "\n" + "Thời Gian Mua: \n" + currentTime + "\n" + "Sản Phẩm : \n" + p.getName() + "\n" + "Số tiền : \n" + p.getPrice() + "\n" + "Số lượng mua: \n" + sl + "\n" + "Số lượng còn lại: \n" + i);
                     System.out.println("Tên khách hàng: \n" + namePeople + "\n" + "Thời Gian Mua: \n" + currentTime + "\n" + "Sản Phẩm: \n" + p.getName() + "\n" + "Số lượng mua: \n" + sl + "\n" + "Số tiền : \n" + money + "\n");
                break;
            }
            if (p.getQuantity()<sl) {
                System.out.println("Không đủ hàng - Khách Hàng Nhập Lại Số Lượng");
                break;
            }
        }
    }
    public void showBill(){
        for (String p:list) {
            System.out.println(p);
        }
    }
}
