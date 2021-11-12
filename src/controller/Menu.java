package controller;

import service.Get_Save_Information;
import service.PhoneBookManager;

import java.util.Scanner;

public class Menu {
    public static void showMenu() {

        System.out.println( "----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----");
        System.out.println( "Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Xem danh sách ");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");


    }
    public static void app() {
        int choice = -1;
        showMenu();
        do {
            Scanner input = new Scanner(System.in);
            try {
                choice = input.nextInt();
            } catch (Exception e) {
                System.out.println();
                input.nextLine();
                choice = -1;

            }finally {
                doChoice(choice);
            }
        } while (true);
    }
    public static void doChoice(int choice) {
        switch (choice) {
            case 1 -> {
                PhoneBookManager.getInstance().showList();
                showMenu();
            }
            case 2 -> {
                PhoneBookManager.getInstance().add();
                showMenu();
            }
            case 3 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Điền số điện thoại cần sửa");
                String phoneNum = scanner.nextLine();
                PhoneBookManager.getInstance().edit(phoneNum);
                showMenu();
            }
            case 4 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Điền số điện thoại cần xóa");
                String phoneNum = scanner.nextLine();
                PhoneBookManager.getInstance().remove(phoneNum);
                showMenu();
            }

            case 5 -> {
                SubMenu.app();
            }
            case 6 -> {
                Get_Save_Information.GetInformation(PhoneBookManager.getInstance().getPhoneBooks(), "contacts.csv");
                showMenu();
            }
            case 7 -> {
                Get_Save_Information.saveInformation(PhoneBookManager.getInstance().getPhoneBooks(), "contacts.csv");
                showMenu();
            }
            case 8 -> {
                System.exit(0);
            }
            default -> {
                System.err.println("Lựa chọn ko hợp lệ nha");

            }
        }
    }

}
