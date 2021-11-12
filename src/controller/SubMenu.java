package controller;
import service.PhoneBookManager;
import java.util.Scanner;

public class SubMenu {
    public static void showMenu() {

        System.out.println( "----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----");
        System.out.println( "Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Tìm theo tên ");
        System.out.println("2. Tìm theo số điện thoại ");
        System.out.println("3. Quay lại menu chính");
        System.out.println("4. Thoát");


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
                Scanner scanner = new Scanner(System.in);
                System.out.println("Điền 1 vài tự trong tên bạn muốn tìm vd : Tìm Khánh thì điền Kh");
                String name = scanner.nextLine();
                PhoneBookManager.getInstance().findByName(name);
                Menu.app();
            }
            case 2 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Điền 1 vài số trong sđt bạn muốn tìm vd : Tìm 012345678 thì điền 123");
                String phoneNum = scanner.nextLine();
                PhoneBookManager.getInstance().findByPhoneNum(phoneNum);
               Menu.app();
            }
            case 3 -> {
                Menu.app();
            }
            case 4 ->{
                System.exit(0);
            }
            default -> {
                System.err.println("Lựa chọn ko hợp lệ nha");

            }
        }
    }

}
