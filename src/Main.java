import Authentication.IDandPasswords;
import Authentication.LoginPage;

public static void main(String[] args) {
    IDandPasswords iDandPasswords = new IDandPasswords();

    LoginPage loginPage = new LoginPage(iDandPasswords.getUsers());
}