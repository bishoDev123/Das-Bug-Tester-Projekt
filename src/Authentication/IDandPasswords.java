package Authentication;
import Users.*;

import java.util.HashMap;

import static java.util.Calendar.PM;

public class IDandPasswords {

    private HashMap<String, User> users = new HashMap<>();

    public IDandPasswords() {
        users.put("admin", new Admin("admin", "12345678"));
        users.put("developer", new Developer("developer", "abcd123"));
        users.put("pm", new ProjectManager("pm", "00000000"));
        users.put("tester", new Tester("tester", "password"));
    }

    public HashMap<String, User> getUsers() {
        return users;
    }
}
