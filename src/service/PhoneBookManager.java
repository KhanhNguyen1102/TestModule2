package service;

import controller.Menu;
import model.PhoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookManager implements GeneralService<PhoneBook> {
    private ArrayList<PhoneBook> phoneBooks;
    private static final PhoneBookManager instance = new PhoneBookManager();

    private PhoneBookManager() {
        phoneBooks = new ArrayList<>();
    }

    public static PhoneBookManager getInstance() {
        return instance;
    }

    public ArrayList<PhoneBook> getPhoneBooks() {
        return phoneBooks;
    }

    public void setPhoneBooks(ArrayList<PhoneBook> phoneBooks) {
        this.phoneBooks = phoneBooks;
    }

    @Override
    public void add() {
        phoneBooks.add(createPhoneBook());
        System.out.println("Thêm thành công");
    }

    @Override
    public void edit(String phoneNum) {
        int indexToEdit = findByPhone(phoneNum);
        if (indexToEdit != -1) {
            PhoneBook phoneBook = createPhoneBook();
            phoneBook.setPhoneNum(phoneBooks.get(indexToEdit).getPhoneNum());
            phoneBooks.set(indexToEdit, phoneBook);
            System.out.println("Sửa thành công");
        } else System.out.println("Không tìm thấy số điện thoại này trong danh bạ");
    }

    @Override
    public void remove(String phoneNum) {
        int indexToRemove = findByPhone(phoneNum);
        if (indexToRemove != -1) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Đã tìm thấy danh bạ, điền y để xóa");
            String input = scanner1.nextLine();
            if (input.equals("y")) {
                phoneBooks.remove(indexToRemove);
                System.out.println("Xóa thành công");
                Menu.app();
            }

        } else {
            System.out.println("Không tìm thấy số điện thoại này trong danh bạ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Điền số điện thoại cần xóa");
            String phoneNum1 = scanner.nextLine();
            PhoneBookManager.getInstance().remove(phoneNum1);
        }
    }

    @Override
    public void showList() {
        for (int i = 0; i < phoneBooks.size(); i++) {
            if (i % 5 == 0 && i != 0) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ấn Enter để xem tiếp");
                String input = scanner.nextLine();
            }
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", phoneBooks.get(i).getName(), phoneBooks.get(i).getPhoneNum(), phoneBooks.get(i).getAddress(), phoneBooks.get(i).getFacebook(), phoneBooks.get(i).getGentle(), phoneBooks.get(i).getGroup(), phoneBooks.get(i).getBirthday(), phoneBooks.get(i).getEmail());
            System.out.println();
        }
    }

    public int findByPhone(String phoneNum) {
        for (int i = 0; i < phoneBooks.size(); i++) {
            boolean isContaint = phoneBooks.get(i).getPhoneNum().equals(phoneNum);
            if (isContaint) {
                return i;
            }
        }
        return -1;
    }

    public void findByName(String Name) {
        ArrayList<PhoneBook> list = new ArrayList<>();
        for (PhoneBook phoneBook : phoneBooks) {
            if (phoneBook.getName().contains(Name)) {
                list.add(phoneBook);
            }
        }
        for (PhoneBook phone : list) {
            System.out.println(phone);
        }
    }

    public void findByPhoneNum(String phoneNum) {
        ArrayList<PhoneBook> list = new ArrayList<>();
        for (PhoneBook phoneBook : phoneBooks) {
            if (phoneBook.getPhoneNum().contains(phoneNum)) {
                list.add(phoneBook);
            }
        }
        for (PhoneBook phone : list) {
            System.out.println(phone);
        }
    }

    public PhoneBook createPhoneBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên :");
        String name = scanner.nextLine();
        String phoneNum = "";
        do {
            System.out.println("Nhập vào số điện thoại :");
            phoneNum = scanner.nextLine();
            if (Validate.validate(phoneNum, Validate.PHONE_NUMBER_REGEX)) {
                break;
            } else System.out.println("Sai định dạng sđt");
        } while (true);
        System.out.println("Nhập vào địa chỉ :");
        String address = scanner.nextLine();
        System.out.println("Nhập vào tên facebook :");
        String facebook = scanner.nextLine();
        System.out.println("Nhập vào giới tính :");
        String gentle = scanner.nextLine();
        System.out.println("Nhập vào tên nhóm muốn lưu trong danh bạ :");
        String group = scanner.nextLine();
        System.out.println("Nhập vào ngày sinh");
        String birthday = scanner.nextLine();
        String email;
        do {
            System.out.println("Nhập vào email");
            email = scanner.nextLine();
            if (Validate.validate(email, Validate.EMAIL_REGEX)) {
                break;
            } else System.out.println("Sai định dạng email");
        } while (true);

        return new PhoneBook(name, phoneNum, address, facebook, gentle, group, birthday, email);
    }
}
