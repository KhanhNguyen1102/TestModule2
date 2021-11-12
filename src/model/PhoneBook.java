package model;

public class PhoneBook extends Person {
    private String group;

    public PhoneBook(String name, String phoneNum, String address, String facebook, String gentle, String birthday, String email) {
        super(name, phoneNum, address, facebook, gentle, birthday, email);
    }

    public PhoneBook(String name, String phoneNum, String address, String facebook, String gentle, String group, String birthday, String email) {
        super(name, phoneNum, address, facebook, gentle, birthday, email);
        this.group = group;
    }

    public PhoneBook(String group) {
        this.group = group;
    }

    public PhoneBook() {
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "name=" + this.getName() +
                ", phoneNum=" + this.getPhoneNum() +
                ", address=" + this.getAddress() +
                ", facebook=" + this.getFacebook() +
                ", gentle=" + this.getGentle() +
                ", birthday=" + this.getBirthday() +
                ", email=" + this.getEmail() +
                ",group=" + group;
    }
}
