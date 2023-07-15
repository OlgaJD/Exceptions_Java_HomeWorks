package Checkers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataCheck {

    public static boolean checkFullName(String element) {
        return element.chars().allMatch(Character::isAlphabetic);
    }

    public static boolean checkBirthDayFormat(String element) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(element);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public static boolean checkDateNow(String element) {
        String pattern = "dd.MM.yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate birthDay = LocalDate.parse(element, formatter);
        LocalDate dateNow = LocalDate.now();
        return birthDay.isBefore(dateNow);
    }

    public static boolean checkPhoneNumber(String element) {
        return element.matches("^\\d{7}$");
    }

    public static boolean checkGender(String element) {
        return element.equalsIgnoreCase("m") || element.equalsIgnoreCase("f");
    }
}
