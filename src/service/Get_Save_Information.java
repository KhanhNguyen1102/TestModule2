package service;

import model.PhoneBook;

import java.io.*;
import java.util.ArrayList;

public class Get_Save_Information {
    public static void saveInformation(ArrayList<PhoneBook> list, String filePath) {
        try {
            File file = new File(filePath);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Tên,Số Điện thoại,Địa chỉ,Tên facebook,Giới tính,Nhóm,Ngày sinh,Email\n");
            String str = "";
            for (PhoneBook phoneBook : PhoneBookManager.getInstance().getPhoneBooks()) {
                str = str.concat(phoneBook.getName()).concat(",");
                str = str.concat(phoneBook.getPhoneNum()).concat(",");
                str = str.concat(phoneBook.getAddress()).concat(",");
                str = str.concat(phoneBook.getFacebook()).concat(",");
                str = str.concat(phoneBook.getGentle()).concat(",");
                str = str.concat(phoneBook.getGroup()).concat(",");
                str = str.concat(phoneBook.getBirthday()).concat(",");
                str = str.concat(phoneBook.getEmail()).concat("\n");
            }
            bw.write(str);
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void GetInformation(ArrayList<PhoneBook> list,String filePath){
        try {
           File file = new File(filePath);
           FileReader fr= new FileReader(file);
           BufferedReader br= new BufferedReader(fr);
           String line=br.readLine();
           while ((line=br.readLine())!=null){
               String[] str = line.split(",");
               PhoneBook phoneBook = new PhoneBook(str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7]);
               PhoneBookManager.getInstance().getPhoneBooks().add(phoneBook);
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
