package controllers;

import models.*;
import sevices.ManagerTown;

import java.util.Scanner;

public class Menu {
    ManagerTown managerTown = new ManagerTown();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    int choice;

    public void showMenu() {
        do {
            System.out.println("---Quản Lý Khách Sạn---\n"
                    + "1.Hiển Thị Thông Tin Khách Thuê\n"
                    + "2. Thêm Khách Thuê Phòng\n"
                    + "3. Xóa Khách Thuê Phòng\n"
                    + "4. Tìm Thông Tin Khách Hàng\n"
                    + "5. Tính Tiền Thuê Phòng\n");
            System.out.println("Choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    managerTown.showAll();
                    break;
                case 2:
                    addPeople();
                    break;

                case 3:
                    System.out.println("Nhập Thông tin khách thuê");
                    int n = inputInt.nextInt();
                    managerTown.delete(n);
                    break;
                case 4:
                    System.out.println("Nhập Tên Khách Thuê");
                    String name = inputString.nextLine();
                    managerTown.search(name);
                    managerTown.showAll();
                    break;
                case 5:
                    System.out.println("Nhập Tên Khách Thuê");
                    String name2 = inputString.nextLine();
                    People people2=(People) managerTown.search2(name2);
                    System.out.println(people2.tinhTien());
                    managerTown.delete2(name2);
            }
        } while (choice != 0);
    }

    public void addPeople() {
        System.out.println("Nhập Vào Họ Tên Khách Hàng");
        String name = inputString.nextLine();
        System.out.println("Nhập vào tuổi");
        int age = inputInt.nextInt();
        System.out.println("Nhâp vào loại phòng");
        String typeRoom = inputString.nextLine();
        System.out.println("Nhập vào số ngày thuê");
        int numberRent = inputInt.nextInt();
        Room room = null;
        switch (typeRoom) {
            case "a":
                room = new RoomA();
                break;
            case "b":
                room = new RoomB();
                break;
            case "c":
                room = new RoomC();
                break;
        }
        People people = new People(name, age, numberRent, room);
        managerTown.add(people);
        managerTown.showAll();
    }
}

