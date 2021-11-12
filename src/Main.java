import controller.Menu;
import model.PhoneBook;
import service.Get_Save_Information;
import service.PhoneBookManager;

public class Main {
    public static void main(String[] args) {
//        PhoneBook phoneBook =new PhoneBook("khánh","0326404939","Đê hoàng mai","Khánh trắng","Nam","family","11/02/1996","sukhanh12@gmail.com");
//        PhoneBook phoneBook1 =new PhoneBook("ánh","0312345678","C0821I1","Ánh 2 phút","Nam","family","11/02/1996","anh2minute@gmail.com");
//        PhoneBook phoneBook2 =new PhoneBook("việt","0398765432","C0821I1","Hoàng Quốc Việt =)))","Nam","family","11/02/1996","vietvuive@gmail.com");
//        PhoneBook phoneBook3 =new PhoneBook("lan anh","0555554444","C0821I1","La la so ciu ","Nữ","family","11/02/1996","laladaica@gmail.com");
//        PhoneBook phoneBook4 =new PhoneBook("bình","0722228888","C0821I1","Bình gold","Nam","family","11/02/1996","binhgold@gmail.com");
//        PhoneBook phoneBook5 =new PhoneBook("như anh","0999999999","C0821I1","Chúa lươn","Nam","family","11/02/1996","nhuanhdao@gmail.com");
//        PhoneBook phoneBook6 =new PhoneBook("dũng","0199999999","C0821I1","Dũng đẹp rai","Nam","family","11/02/1996","dungdepzai@gmail.com");
//        PhoneBookManager.getInstance().getPhoneBooks().add(phoneBook);
//        PhoneBookManager.getInstance().getPhoneBooks().add(phoneBook1);
//        PhoneBookManager.getInstance().getPhoneBooks().add(phoneBook2);
//        PhoneBookManager.getInstance().getPhoneBooks().add(phoneBook3);
//        PhoneBookManager.getInstance().getPhoneBooks().add(phoneBook4);
//        PhoneBookManager.getInstance().getPhoneBooks().add(phoneBook5);
//        PhoneBookManager.getInstance().getPhoneBooks().add(phoneBook6);
//        Get_Save_Information.saveInformation(PhoneBookManager.getInstance().getPhoneBooks(), "contacts.csv");
        Get_Save_Information.GetInformation(PhoneBookManager.getInstance().getPhoneBooks(), "contacts.csv");
        Menu.app();
    }
}
