package controllers;


import models.Information;
import sevices.Family;
import sevices.Street;

import java.util.Scanner;

public class Menu {
    Street street = new Street();
    Family family=new Family();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    int choice;

    public void showMenu() {
        do {
            System.out.println("---Quản Lý---\n"
                    + "1.Quản Lý Khu Phố\n"
                    + "2.Quản Lí Hộ Gia Đình\n"
                    + "3.Quản Lý Người\n");
            System.out.println("Choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showStreet();
                    break;
                case 2:
                    showFamily();
                    break;
                case 3:


            }
        }
            while (choice != 0) ;
    }

    public void showStreet() {
        do {
            System.out.println("---Quản Lý Khu Phố---\n"
                    + "1.Xem Danh Sách Hộ\n"
                    + "2.Tìm Kiếm Hộ\n"
                    + "3.Xóa Hộ\n"
                    + "4.Thêm Hộ Mới\n" +
                    "5. Thêm Thành viên theo số nhà");
            System.out.println("Choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    street.showAll();
                    break;
                case 2:
                    showSearchStreet();
                    break;
                case 3:
                    System.out.println("Nhập Vào Số Hộ Cần Xóa");
                    int a = inputInt.nextInt();
                    street.deleteNember(a);
                    System.out.println("Số Hộ Còn Lại Sau Khi Xóa Là");
                    street.showAll();
                    break;
                case 4:
                    Family family = new Family();

                    break;
                case 5:

            }
        }
        while (choice != 0) ;

    }

    public void showSearchStreet() {
        do {
            System.out.println("---Tìm Kiếm---\n"
                    + "1.Tìm Kiếm Theo Số Nhà\n"
                    + "2.Tìm Kiếm Theo Số Lượng Thành Viên \n");
            System.out.println("Choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập Vào Số Nhà Cần Tìm");
                    int n = inputInt.nextInt();
                    street.searchNumber(n);
                    break;
                case 2:
                    System.out.println("Nhập Vào Số Lượng Thành Viên Cần Tìm");
                    int a = inputInt.nextInt();
                    street.searchPeopleNumber(a);
                    break;


            }
        }
            while (choice != 0) ;

    }

    public void showFamily () {
        do {

            System.out.println("---Quản Lý Hộ Gia Đình---\n"
                    + "1.Xem Danh Sách Thành Viên\n"
                    + "2.Tìm Kiếm \n"
                    + "3.Xóa Thành Viên\n"
                    + "4.Thêm Thành Viên\n");
            System.out.println("Choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    family.showAll();
                    break;
                case 2:
                    System.out.println("Nhập Vào số ID Thành Viên Cần Tìm");
                    int n = inputInt.nextInt();
                    family.searchNumber(n);
                    break;
                case 3:

                    System.out.println("Nhập Vào Số ID Thành Viên Cần Xóa");
                    int a = inputInt.nextInt();
                    family.deleteNember(a);
                    System.out.println("Số Hộ Còn Lịa Sau Khi Xóa Là");
                    family.showAll();
                    break;
                case 4:
                    addPeople();

                    break;


            }
        }
        while (choice != 0) ;


    }
    public void showPeople() {
        do {
            System.out.println("---Quản Lý Người---\n"
                    + "1.Thêm Thành Viên\n"
                    + "2.Chỉnh Sửa Thông Tin Người \n"
                    + "3.Xóa Người\n"
                    + "4.Tìm Kiếm Người\n");
            System.out.println("Choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showPeople();

                    break;
                case 2:

                    break;
                case 3:

                    System.out.println("Nhập Vào Số ID Thành Viên Cần Xóa");
                    int a = inputInt.nextInt();
                    family.deleteNember(a);
                    System.out.println("Số Hộ Còn Lịa Sau Khi Xóa Là");
                    family.showAll();
                    break;
                case 4:
                    System.out.println("Nhập Vào số ID Thành Viên Cần Tìm");
                    int n = inputInt.nextInt();
                    family.searchNumber(n);
                    break;


            }
        }
        while (choice != 0) ;


    }
    public void addPeople(){

        System.out.println("Nhập Họ Và Tên");
        String name=inputString.nextLine();
        System.out.println("Nhập Tuổi");
        int age=inputInt.nextInt();
        System.out.println("Nhập Vào Nghề Nghiệp");
        String job=inputString.nextLine();
        Information member1 = new Information(name, age, job);
        family.addNember(member1);
        family.showAll();



    }
}
