public class Contact {
    String surname;
    String name;
    String midlename;
    String birthDay;
    String phoneNumber;
    String gender;

    public Contact(String surname, String name, String midlename, String birthDay, String phoneNumber, String gender) {
        this.surname = surname;
        this.name = name;
        this.midlename = midlename;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + midlename + " " + birthDay + " " + phoneNumber + " " + gender;
    }
}
