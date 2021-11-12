package model;

public class Person {
    private String name;
    private String phoneNum;
    private String address;
    private String facebook;
    private String gentle;
    private String birthday;
    private String email;

    public Person(String name, String phoneNum, String address, String facebook, String gentle, String birthday, String email) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.facebook = facebook;
        this.gentle = gentle;
        this.birthday = birthday;
        this.email = email;
    }

    public Person() {
    }

    public String getGentle() {
        return gentle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGentle(String gentle) {
        this.gentle = gentle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }


}
