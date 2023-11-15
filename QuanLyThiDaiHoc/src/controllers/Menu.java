package controllers;

import models.In4;
import models.khoiA;
import models.khoiB;
import models.khoiC;
import sevices.Admissions;

import java.util.Random;
import java.util.Scanner;

public class Menu {
    Admissions admissions = new Admissions();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMenu() {

        int choice;
        do {

            System.out.println("------Menu------\n"
                    + "1.Thêm Mới Thí Sinh\n"
                    + "2.Hiểm Thị Thông Tin Thí Sinh Và Khối Thi Của Thí Sinh\n"
                    + "3.Tìm Kiếm Theo Số Báo Danh\n"
                    + "4.Thoát\n");
            System.out.println("Choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    addThiSinh();
                    break;
                case 2:
                    admissions.showAll();
                case 3:
                    System.out.println("Nhập Số Báo Danh Cần Tìm");
                    int soBaoDanh=inputInt.nextInt();
                    System.out.println(admissions.searchSobaoDanh(soBaoDanh));
            }
        } while (choice != 0);

    }

    public void addThiSinh() {
        int choice;
        do {

            System.out.println("------Menu------\n"
                    + "1.Thêm Thí Sinh Khối A\n"
                    + "2.Thêm Thí Sinh Khối B\n"
                    + "3.Thêm Thí Sinh Khối C\n"
                    + "0.Thoát");
            System.out.println("Choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    thiSinhKhoiA();
                    break;
                case 2:
                    thiSinhKhoiB();
                    break;
                case 3:
                    thiSinhKhoiC();
                    break;



            }
        } while (choice != 0);
    }

    public void thiSinhKhoiA() {
        System.out.println("Nhập Số Báo Danh");
        int soBaoDanh = inputInt.nextInt();
        System.out.println("Nhập Họ Và Tên ");
        String hoVaTen = inputString.nextLine();
        System.out.println("Nhập Địa Chỉ Thí Sinh");
        String diaChi=inputString.nextLine();
        System.out.println("Nhập Mức Độ Ưu Tiên");
        int mucDoUuTien =inputInt.nextInt();
        In4 thiSinhKhoiA=new khoiA(soBaoDanh,hoVaTen,diaChi,mucDoUuTien);
        khoiA thi1=new khoiA(1201,"Bui Minh Hiéu","Khánh Trung",1);
        khoiA thi2=new khoiA(1321,"Bui Minh Hiéu2","Khánh Trung2",2);
        admissions.addThiSinh(thiSinhKhoiA);
        admissions.addThiSinh(thi1);
        admissions.addThiSinh(thi2);
        admissions.showAll();
    }
    public void thiSinhKhoiB() {
        System.out.println("Nhập Số Báo Danh");
        int soBaoDanh = inputInt.nextInt();
        System.out.println("Nhập Họ Và Tên ");
        String hoVaTen = inputString.nextLine();
        System.out.println("Nhập Địa Chỉ Thí Sinh");
        String diaChi=inputString.nextLine();
        System.out.println("Nhập Mức Độ Ưu Tiên");
        int mucDoUuTien =inputInt.nextInt();
        In4 thiSinhKhoiB=new khoiB(soBaoDanh,hoVaTen,diaChi,mucDoUuTien);
        khoiB thi1=new khoiB(1234,"Bui Minh Hiéu3","Khánh Trung3",3);
        admissions.addThiSinh(thiSinhKhoiB);
        admissions.addThiSinh(thi1);
        admissions.showAll();
    }
    public void thiSinhKhoiC() {
        System.out.println("Nhập Số Báo Danh");
        int soBaoDanh = inputInt.nextInt();
        System.out.println("Nhập Họ Và Tên ");
        String hoVaTen = inputString.nextLine();
        System.out.println("Nhập Địa Chỉ Thí Sinh");
        String diaChi=inputString.nextLine();
        System.out.println("Nhập Mức Độ Ưu Tiên");
        int mucDoUuTien =inputInt.nextInt();
        In4 thiSinhKhoiC=new khoiC(soBaoDanh,hoVaTen,diaChi,mucDoUuTien);
        admissions.addThiSinh(thiSinhKhoiC);
        admissions.showAll();
    }
}
