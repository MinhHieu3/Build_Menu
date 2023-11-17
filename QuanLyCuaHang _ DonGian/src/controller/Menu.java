package controller;

import sevices.ManagerProduct;

import java.util.Scanner;

public class Menu {
    ManagerProduct managerProduct=new ManagerProduct();
    Scanner intputInt=new Scanner(System.in);
    Scanner intputString=new Scanner(System.in);
    int choice;
    public void showMenu(){
        do {
            System.out.println("---Quản Lí Cửa Hàng---\n"+
                    "1.Xem Danh Sách Sản Phẩm\n"+
                    "2.Tìm Kiếm Theo Tên\n"+
                    "3.Xem Sản Phẩm Còn Hàng\n"+
                    "4.Mua Hàng\n"+
                    "5.Xem Danh Sách Đơn Hàng");
            System.out.println("Choice");
            choice=intputInt.nextInt();
            switch (choice){
                case 1:
                    managerProduct.showAll();
                    break;
                case 2:
                    System.out.println("Nhập Tên Sản Phẩm Muốn Tìm");
                    String name=intputString.nextLine();
                    managerProduct.search(name);
                    break;
                case 3:
                    managerProduct.searchQuantily();
                    break;
                case 4:
                    System.out.println("Nhập Vào ID Sản Phẩm");
                    int id=intputInt.nextInt();
                    System.out.println("Nhập Vào Số Lượng Mua");
                    int number=intputInt.nextInt();
                    System.out.println("Nhập Vào Tên Khách Hàng");
                    String namePeople=intputString.nextLine();
                    managerProduct.check(id,number,namePeople);
                    break;
                case 5:
                    managerProduct.showBill();
                    break;
            }
        }while (choice!=0);
    }
}
