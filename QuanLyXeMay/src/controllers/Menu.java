package controllers;

import models.Moto;
import sevices.ManagerMoto;

import java.util.Scanner;

public class Menu {
    ManagerMoto managerMoto = new ManagerMoto();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    int choice;

    public void showMenu() {
        do {
            System.out.println("-----Menu-----\n"
                    + "1.Thêm Xe Máy\n"
                    + "2.Sửa Thông Tin\n"
                    + "3.Xóa Xe Máy\n"
                    + "4.Hiển Thị Thông Tin Xe Máy\n"
                    + "5.Tìm Kiếm Theo Tên Gần Đúng\n"
                    + "6.Tìm Kiếm Theo Khoảng Giá\n"
                    + "7.Sắp Xếp Theo CC Tăng Dần\n"
                    + "8.Sắp Xếp Theo CC Giảm Dần\n");
            System.out.println("Choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    addMoto();
                    break;
                case 2:
                    System.out.println("Nhập Thông Tin Xe Muốn Xửa");
                    int a=inputInt.nextInt();
                    System.out.println("----Thông Tin Muốn Sửa----");
                    System.out.println("Nhập ID Xe Máy");
                    int numberId = inputInt.nextInt();
                    System.out.println("Nhập Tên Xe");
                    String nameMoto2 = inputString.nextLine();
                    System.out.println("Nhập Giá Tiền");
                    int numberPrice = inputInt.nextInt();
                    System.out.println("Nhập Phân Khối Của Xe");
                    int numberCc = inputInt.nextInt();
                    Moto moto = new Moto(numberId, nameMoto2, numberPrice, numberCc);
                    managerMoto.edit(a,moto);
                    break;
                case 3:
                    System.out.println("Nhập Tên Xe Muốn Xóa");
                    String name = inputString.nextLine();
                    managerMoto.delete(name);
                    break;
                case 4:
                    managerMoto.showAll();
                    break;
                case 5:
                    System.out.println("Nhập Tên Xe Muốn Tìm");
                    String nameMoto = inputString.nextLine();
                    managerMoto.searchName(nameMoto);
                    break;
                case 6:
                    System.out.println("Nhập Giá Xe Muốn Tìm");
                    int price = inputInt.nextInt();
                    managerMoto.searchPrice(price);
                    break;
                case 7:
                    managerMoto.ascendingUp();
                    break;
                case 8:
                    managerMoto.ascendingDown();
                    break;
            }
        } while (choice != 0);
    }

    public void addMoto() {
        System.out.println("Nhập ID Xe Máy");
        int numberId = inputInt.nextInt();
        System.out.println("Nhập Tên Xe");
        String nameMoto = inputString.nextLine();
        System.out.println("Nhập Giá Tiền");
        int numberPrice = inputInt.nextInt();
        System.out.println("Nhập Phân Khối Của Xe");
        int numberCc = inputInt.nextInt();
        Moto moto1 = new Moto(numberId, nameMoto, numberPrice, numberCc);
        managerMoto.add(moto1);
        managerMoto.showAll();
    }
}
