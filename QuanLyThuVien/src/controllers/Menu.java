package controllers;

import models.Book;
import models.Library;
import models.Magazine;
import models.Newspaper;
import serviecs.ManagerBook;

import java.util.Scanner;

public class Menu {
    ManagerBook managerBook = new ManagerBook();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMenu() {

        int choice;
        do {
            System.out.println("----Menu----\n"
                    + "1.Thêm Tài Liệu \n"
                    + "2.Xóa Tài Liệu Theo Mã Tài Liệu\n"
                    + "3.Hiển Thị Tất Cả Thông Tin\n"
                    + "4.Tìm Kiếm Tài Liệu Theo Loại\n"
                    + "0.Thoát");
            System.out.println("Choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    themTaiLieu();
                    break;
                case 2:
                    System.out.println("Nhập Mã Tài Liệu Cần Xóa");
                    String name = inputString.nextLine();
                    managerBook.deleteDocument(name);
                    System.out.println("Danh Sách Sau Khi Xóa");
                    managerBook.showAll();
                    break;
                case 3:
                    managerBook.showAll();
                    break;
                case 4:
                   timKiemTaiLieu();
                   break;
            }
        } while (choice != 0);
    }

    public void timKiemTaiLieu() {

        int choice;
        do {
            System.out.println("----Menu----\n"
                    + "1.Tìm Kiếm Book \n"
                    + "2.Tìm Kiếm Tạp Chí  \n"
                    + "3.Tìm Kiếm Báo\n"
                    + "0.Thoat");
            System.out.println("Choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(" Nhập Tên Tác Giả Muốn Tìm Kiếm");
                    String tenTacGia = inputString.nextLine();
                    System.out.println(managerBook.findBook(tenTacGia));
                    break;
                case 2:
                    System.out.println("Nhập Số Phát Hành Muốn Tìm Kiếm");
                    int soPhatHanh = inputInt.nextInt();
                    System.out.println(managerBook.findMagazine(soPhatHanh));
                    break;
                case 3:
                    System.out.println("Nhập Tên Tác Giả Muốn Tìm Kiếm");
                    int ngayPhatHanh = inputInt.nextInt();
                    System.out.println(managerBook.findNewspaper(ngayPhatHanh));
                    break;
            }
        } while (choice != 0);

    }
    public void themTaiLieu() {

        int choice;
        do {
            System.out.println("----Menu----\n"
                    + "1.Thêm Sách \n"
                    + "2.Thêm Tạp Chí  \n"
                    + "3.Thêm Báo\n"
                    + "0.Thoat");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addMagazine();
                    break;
                case 3:
                    addNewspaper();
                    break;
            }
        } while (choice != 0);

    }

    public void addBook() {
        System.out.println(" Nhập Mã Tài Liệu");
        String maTaiLieu = inputString.nextLine();
        System.out.println(" Nhập Tên Nhà Xuất Bản");
        String tenNhaXanXuat = inputString.nextLine();
        System.out.println("Nhập Số Bản Phát Hành");
        int soBanPhatHanh = inputInt.nextInt();
        System.out.println("Nhập Tên Tác Giả");
        String tenTacGia = inputString.nextLine();
        System.out.println("Nhập Số Trang");
        int soTrang = inputInt.nextInt();
        Library book1 = new Book(maTaiLieu, tenNhaXanXuat, soBanPhatHanh, tenTacGia, soTrang);
        managerBook.addDocument(book1);
        managerBook.showAll();
    }

    public void addNewspaper() {
        System.out.println(" Nhập Mã Tài Liệu");
        String maTaiLieu = inputString.nextLine();
        System.out.println(" Nhập Tên Nhà Xuất Bản");
        String tenNhaXanXuat = inputString.nextLine();
        System.out.println("Nhập Số Bản Phát Hành");
        int soBanPhatHanh = inputInt.nextInt();
        System.out.println("Nhập Số Phát Hành");
        int soPhatHanh = inputInt.nextInt();
        System.out.println("Nhập Tháng Phát Hành");
        int thangPhatHanh = inputInt.nextInt();
        Library magazine1 = new Magazine(maTaiLieu, tenNhaXanXuat, soBanPhatHanh, soPhatHanh, thangPhatHanh);
        managerBook.addDocument(magazine1);
        managerBook.showAll();
    }

    public void addMagazine() {
        System.out.println(" Nhập Mã Tài Liệu");
        String maTaiLieu = inputString.nextLine();
        System.out.println(" Nhập Tên Nhà Xuất Bản");
        String tenNhaXanXuat = inputString.nextLine();
        System.out.println("Nhập Số Bản Phát Hành");
        int soBanPhatHanh = inputInt.nextInt();
        System.out.println("Nhập Số Ngày Phát Hanh");
        int ngayPhatHanh = inputInt.nextInt();
        Library newspaper1 = new Newspaper(maTaiLieu, tenNhaXanXuat, soBanPhatHanh, ngayPhatHanh);
        managerBook.addDocument(newspaper1);
        managerBook.showAll();
    }
}
