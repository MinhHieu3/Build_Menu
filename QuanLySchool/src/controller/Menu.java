package controller;

import models.Strudent;
import models.Teacher;
import sevices.ManagerSchool;
import sevices.ManagerStrudent;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
    ManagerStrudent managerStrudent=new ManagerStrudent();
    ManagerSchool managerSchool=new ManagerSchool();
    Scanner inputInt=new Scanner(System.in);
    Scanner inputString=new Scanner(System.in);
    String choice;
    public void showMenu(){
        do {
            System.out.println("---Menu Quản Lí---\n"
            +"1.Quản Lý Điểm Học Sinh\n"
            +"2.Quản Lý Giáo Viên\n");
            System.out.println("Choice");
            choice=inputString.nextLine();
            if (isInterger(choice)){
                switch (choice){
                    case "1":
                        showMenuStudent();
                        break;
                    case "2":
                        showMenuTeacher();
                        break;
                }
            }
        }while (!choice.equals("0"));

    }
    public void showMenuStudent(){
        do {
            System.out.println("---Menu Quản Lý Học Sinh---\n"
                    +"1.Hiển Thị Danh Sách\n"
                    +"2.Sửa Thông Tin Học Sinh\n"
                    +"3.Xóa  Học Sinh\n"
                    +"4.Thêm Học Sinh\n"
                    +"5.Hiện Thị Danh Sách Học Sinh Điểm Trung Bình\n"
                    +"6.Hiện Thị Danh Sách Học Sinh Giỏi\n"
                    +"7.Hiện Thị Danh Sách Học Sinh Với Trạng Thái Học Tập\n"
            );
            System.out.println("Choice");
            choice=inputString.nextLine();
            if (isInterger(choice)){
                switch (choice){
                    case "1":
                        managerStrudent.showAll();
                        break;
                    case "2":
                        System.out.println("Nhập Thông Tin Người Muốn Sửa");
                        String  editStrudent=inputString.nextLine();
                        System.out.println("----Thông Tin Muốn Sửa----");
                        System.out.println("Nhập Họ Và Tên ");
                        String editNameStrudentss=inputString.nextLine();
                        System.out.println("Nhập Điểm Toán ");
                        int editmath=inputInt.nextInt();
                        System.out.println("Nhập Điểm Lý ");
                        int editPhysical=inputInt.nextInt();
                        System.out.println("Nhập Điểm Hóa ");
                        int editChemistry=inputInt.nextInt();
                        Strudent editStrudents=new Strudent(editNameStrudentss,editmath,editPhysical,editChemistry);
                        managerStrudent.edit(editStrudent,editStrudents);
                        managerStrudent.showAll();
                        break;
                    case "3":
                        System.out.println("Nhập Thông Tin Học Sinh Muốn Xóa");
                        String  nameStrudent=inputString.nextLine();
                        managerStrudent.delete(nameStrudent);
                        break;
                    case "4":
                        addStudent();
                        break;
                    case "5":
                        managerStrudent.showList1();
                        break;
                    case "6":
                        managerStrudent.showList2();
                        break;
                    case "7":
                        managerStrudent.showList3();
                        managerStrudent.showList4();
                        break;
                }
            }
        }while (!choice.equals("0"));
    }
    public void showMenuTeacher(){
        do {
            System.out.println("---Menu Quản Lý Giáo Viên---\n"
                    +"1.Hiển Thị Danh Sách\n"
                    +"2.Sửa Thông Tin Giáo Viên\n"
                    +"3.Xóa  Giáo Viên\n"
                    +"4.Thêm Giáo Viên\n"
                    +"5.Tìm Giáo Viên Theo Môn\n"
                    +"6.Sắp Xếp Giáo Viên Theo Lương\n");
            System.out.println("Choice");
            choice=inputString.nextLine();
            if (isInterger(choice)){
                switch (choice){
                    case "1":
                        managerSchool.showAll();
                        break;
                    case "2":
                        System.out.println("Nhập Thông Tin Người Muốn Sửa");
                        String  editTeacher=inputString.nextLine();
                        System.out.println("----Thông Tin Muốn Sửa----");
                        System.out.println("Nhập Họ Và Tên ");
                        String editNameStrudentss=inputString.nextLine();
                        System.out.println("Nhập Môn Dạy ");
                        String editSubject=inputString.nextLine();
                        System.out.println("Nhập Lương ");
                        int editWage=inputInt.nextInt();
                        Teacher editTeachers=new Teacher(editNameStrudentss,editSubject,editWage);
                        managerSchool.edit(editTeacher,editTeachers);
                        break;
                    case "3":
                        managerSchool.showAll();
                        System.out.println("Nhập Thông Tin Giáo Viên Muốn Xóa");
                        String  nameTeachers=inputString.nextLine();
                        managerSchool.delete(nameTeachers);
                        break;
                    case "4":
                        addTeacher();
                        break;
                    case "5":
                        System.out.println("Nhập Thông Tin Giáo Viên Muốn Tìm");
                        String nameSubject=inputString.nextLine();
                        System.out.println(managerSchool.search(nameSubject));
                        break;
                    case "6":
                        managerSchool.ascendingUp();
                        break;

                }
            }
        }while (!choice.equals("0"));
    }
    public void addStudent(){
        System.out.println("Nhập Họ Và Tên ");
        String nameStrudentss=inputString.nextLine();
        System.out.println("Nhập Điểm Toán ");
        int math=inputInt.nextInt();
        System.out.println("Nhập Điểm Lý ");
        int physical=inputInt.nextInt();
        System.out.println("Nhập Điểm Hóa ");
        int chemistry=inputInt.nextInt();
        Strudent strudent=new Strudent(nameStrudentss,math,physical,chemistry);
        managerStrudent.add(strudent);
    }
    public void addTeacher(){
        System.out.println("Nhập Họ Và Tên ");
        String newTeacher=inputString.nextLine();
        System.out.println("Nhập Tên Môn Học ");
        String newSubject=inputString.nextLine();
        System.out.println("Nhập Lương ");
        int newWega=inputInt.nextInt();
        Teacher teacher1=new Teacher(newTeacher,newSubject,newWega);
        managerSchool.add(teacher1);
    }
    public boolean isInterger(String input){
        try {
            Integer.parseInt(input);
            return true;
        }catch (NumberFormatException e){
            System.out.println("Không hợp lệ vui lòng chọn lại ");
            System.out.println("--------------------------------");
            return false;
        }
    }
}
