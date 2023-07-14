import ContactExceptions.*;
import Checkers.DataCheck;

public class ContactBuilder {

    public static Contact createContact(String input) {
        String[] temp = input.split(" ");
        if (temp.length < 6) {
            throw new IncorrectSizeException(temp.length);
        }
        if (temp.length > 6) {
            throw new IncorrectSizeException(temp.length);
        }
        if (!DataCheck.checkFullName(temp[0])) {
            throw new IncorrectSurnameException(temp[0]);
        }
        if (!DataCheck.checkFullName(temp[1])) {
            throw new IncorrectNameException(temp[1]);
        }
        if (!DataCheck.checkFullName(temp[2])) {
            throw new IncorrectMiddleNameException(temp[2]);
        }
        if (!DataCheck.checkBirthDayFormat(temp[3])) {
            throw new IncorrectBirthDayException("Формат даты рождения не верный");
        }
        if (DataCheck.checkDateNow(temp[3])) {
            throw new IncorrectBirthDayException("Указанная дата рождения еще не наступила");
        }
        if (!DataCheck.checkPhoneNumber(temp[4])) {
            throw new IncorrectPhoneNumberException(temp[4]);
        }
        if (!DataCheck.checkGender(temp[5])) {
            throw new IncorrectGenderException(temp[5]);
        }
        Contact contact;
        contact = new Contact(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5]);
        contact.name = temp[1];
        contact.midlename = temp[2];
        contact.birthDay = temp[3];
        contact.phoneNumber = temp[4];
        contact.gender = temp[5];
        return contact;
    }
}
