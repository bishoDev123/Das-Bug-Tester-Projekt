package Users;

import java.util.ArrayList;

public class UserStore {
    private ArrayList<User> users = new ArrayList<>();

    public void AddUser(User u) {
        users.add(u);
    }

    public User login(String id, String password) {
        for (User u : users) {
            if (u.getId().equals(id) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }
}
