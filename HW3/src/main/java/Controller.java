public class Controller {
    public static void run() {
        try {
            String input = UserInput.inputUserString();
            Contact contact = ContactBuilder.createContact(input);
            FileWorker fileWorker = new FileWorker();
            fileWorker.newContact(contact);
            System.out.println("Создан новый контакт");
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}
