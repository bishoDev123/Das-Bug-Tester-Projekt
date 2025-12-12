import Authentication.IDandPasswords;
import Authentication.LoginPage;
import Bug.BugFileManager;
import Bug.Bug;

public static void main(String[] args) {
    IDandPasswords iDandPasswords = new IDandPasswords();

    LoginPage loginPage = new LoginPage(iDandPasswords.getUsers());

    Bug bug = new Bug();
    bug.setTitle("Login not working");
    bug.setDescription("Error when clicking login button.");

    BugFileManager.saveBug(bug, "bug1.txt");

    Bug loaded = BugFileManager.loadBug("bug1.txt");
    System.out.println(loaded.getTitle());
    System.out.println(loaded.getDescription());
}