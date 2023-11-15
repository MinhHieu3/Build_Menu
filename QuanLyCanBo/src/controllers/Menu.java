package controllers;

import models.CanBo;
import models.CongNhan;
import models.KySu;
import models.NhanVien;
import services.QuanLyCanBo;

import java.util.Scanner;

public class Menu {
    QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMenu() {
        int choice;
        do {
            System.out.println("----Menu-----\n" +
                    "1. Thêm Cán Bộ \n" +
                    "2. Tìm Kiếm \n" +
                    "3. Hiên thị Danh Sách\n" +
                    "4. Xa Thải \n" +
                    "0. Thoát \n");
            System.out.println("choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showDanhSachAll();
                    break;
                case 2:
//                    System.out.println("Nhập Loại Muốn Tìm");
//                    String loai=inputString.nextLine();
//                    if (){
                    System.out.println("Nhập tên cần tìm");
                    String name =inputString.nextLine();
                    System.out.println(quanLyCanBo.timKiem(name));

                    break;
                case  3:
                    quanLyCanBo.showAll();
                    break;
                case 4:
                    System.out.println("Nhập tên cần xóa");
                    String name2=inputString.nextLine();
                    quanLyCanBo.xathai(name2);
                    System.out.println("Danh sách sau xóa");
                    quanLyCanBo.showAll();
                    break;
            }
        }
        while (choice != 0);
    }

    public void showDanhSachAll() {
        int choice;
        do {
            System.out.println("----Menu-----\n" +
                    "1. Thêm Kỹ Sư\n" +
                    "2. Thêm Nhân Viên \n" +
                    "3. Thêm Công Nhân\n" +
                    "0. Thoát \n");
            System.out.println("choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showKySu();
                    break;
                case 2:
                    showNhanVien();
                    break;
                case 3:
                    showCongNhan();
                case 0:
                    showMenu();
            }
        }
        while (choice != 0);

    }

    public void showKySu() {
        System.out.println("Nhập Họ và tên");
        String name = inputString.nextLine();
        System.out.println("Nhập Tuổi");
        int tuoi = inputInt.nextInt();
        System.out.println("Nhập giới tính");
        String gioiTinh = inputString.nextLine();
        System.out.println("Nhập địa chỉ");
        String diaChi = inputString.nextLine();
        System.out.println("Thêm ngành đào tạo");
        String nganhDaoTao = inputString.nextLine();
        CanBo cb1 = new KySu(name, tuoi, gioiTinh, diaChi, nganhDaoTao);
        quanLyCanBo.addCanBo(cb1);
        quanLyCanBo.showAll();
    }

    public void showNhanVien() {
        System.out.println("Nhập Họ và tên");
        String name = inputString.nextLine();
        System.out.println("Nhập Tuổi");
        int tuoi = inputInt.nextInt();
        System.out.println("Nhập giới tính");
        String gioiTinh = inputString.nextLine();
        System.out.println("Nhập địa chỉ");
        String diaChi = inputString.nextLine();
        System.out.println(" Công việc");
        String congViec = inputString.nextLine();
        CanBo cb2 = new NhanVien(name, tuoi, gioiTinh, diaChi, congViec);
        quanLyCanBo.addCanBo(cb2);
        quanLyCanBo.showAll();
    }

    public void showCongNhan() {
        System.out.println("Nhập Họ và tên");
        String name = inputString.nextLine();
        System.out.println("Nhập Tuổi");
        int tuoi = inputInt.nextInt();
        System.out.println("Nhập giới tính");
        String gioiTinh = inputString.nextLine();
        System.out.println("Nhập địa chỉ");
        String diaChi = inputString.nextLine();
        System.out.println(" Nhập bậc lương");
        int bacLuong = inputInt.nextInt();
        CanBo cb3 = new CongNhan(name, tuoi, gioiTinh, diaChi, bacLuong);
        quanLyCanBo.addCanBo(cb3);
        quanLyCanBo.showAll();
    }
}
