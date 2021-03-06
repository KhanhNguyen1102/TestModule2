package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final String PHONE_NUMBER_REGEX = "0[35789][0-9]{8}";
    public static final String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

    public static boolean validate(String string, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

}
