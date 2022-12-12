import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class UserChecker {
    private final String name;
    private final String password;
    public boolean result;


    public UserChecker(String name, String password) {
        this.name = name;
        this.password = password;
        this.result = check();
    }

    private boolean check() {
        String winUser = System.getProperty("user.name");
        File pathToBase = new File("C:\\users\\" + winUser + "\\Desktop\\usersBase\\");
        File[] files = pathToBase.listFiles();
        assert files != null;
        for (File file : files) {
            if (file.getName().replace(".txt", "").equals(this.name)) {
                try (FileReader fileReader = new FileReader(file)) {
                    Scanner scanner = new Scanner(fileReader);
                    while (scanner.hasNextLine()) {
                        String str=scanner.nextLine();
                        if (str.startsWith("password") &
                                str.replace("password", "")
                                        .trim().equals(this.password)) {
                            return true;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return false;
                }

            }
        }
        return false;
    }
}
