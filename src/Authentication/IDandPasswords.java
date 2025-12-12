package Authentication;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    public IDandPasswords() {
        logininfo.put("admin", "12345678");
        logininfo.put("developer", "abcd123");
        logininfo.put("pm", "00000000");
        logininfo.put("tester", "password");
    }

    public HashMap getLoginInfo() {
        return logininfo;
    }
}
