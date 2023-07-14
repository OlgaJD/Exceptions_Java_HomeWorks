import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWorker {
    public void newContact(Contact contact) {
        try {
            FileWriter writer = new FileWriter(new File(contact.surname + ".txt"), true);
            writer.write(contact + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
