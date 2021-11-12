import controller.Menu;
import model.PhoneBook;
import service.Get_Save_Information;
import service.PhoneBookManager;

public class Main {
    public static void main(String[] args) {
        Get_Save_Information.GetInformation(PhoneBookManager.getInstance().getPhoneBooks(), "contacts.csv");
        Menu.app();
    }
}
