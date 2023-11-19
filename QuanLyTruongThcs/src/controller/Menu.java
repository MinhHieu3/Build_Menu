package controller;

import models.Student;
import sevices.ManagerStudent;

import java.util.Scanner;

public class Menu {
    ManagerStudent managerStudent = new ManagerStudent();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    int choice;

    public void showMenu() {
        do {
            System.out.println("----Quản Lý Học Sinh ----\n"
                    + "1.Thêm Học Sinh \n" +
                    "2. Hiển Thị Các Học Sinh 20 Tuổi \n" +
                    "3. Tìm Kiếm Học Sinh Theo Tuổi Và Quê Quán\n" +
                    "4. Hiển Thị Danh Sách Học Sinh \n");
            System.out.println("Choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    managerStudent.showStudent();
                    break;
                case 3:
                    System.out.println("Nhập Vào Địa Chỉ");
                    String home = inputString.nextLine();
                    System.out.println("Nhập Vào Tuổi");
                    int age = inputInt.nextInt();
                    System.out.println(managerStudent.search(age,home));
                    break;
                case 4:
                    managerStudent.showAll();
                    break;
            }
        } while (choice != 0);
    }

    public void addStudent() {
        System.out.println("Nhập Vào Họ Và Tên Học Sinh ");
        String name = inputString.nextLine();
        System.out.println("Nhập Vào Địa Chỉ");
        String home = inputString.nextLine();
        System.out.println("Nhập Vào Tuổi");
        int age = inputInt.nextInt();
        Student student = new Student(name, home, age);
        managerStudent.add(student);
    }
}
