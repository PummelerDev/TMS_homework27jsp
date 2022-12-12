import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Objects;

public class TxtWriter {
    private final String name;
    private final String password;


    public TxtWriter(String name, String password) {
        this.name = name;
        this.password = password;
        write();
    }

    private void write() {
        String winUser = System.getProperty("user.name");
        File pathToBase = new File("C:\\users\\" + winUser + "\\Desktop\\usersBase\\");
        if (!pathToBase.exists()) {
            File dir = new File(pathToBase.getAbsolutePath());
            dir.mkdir();
        }
        try (FileWriter fileWriter = new FileWriter(pathToBase.getAbsolutePath() + "\\" + this.name.trim() + ".txt", true)) {
            fileWriter.append("name ").append(this.name.trim());
            fileWriter.append('\n');
            fileWriter.append("password ").append(this.password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 