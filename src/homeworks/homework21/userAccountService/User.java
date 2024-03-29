package homeworks.homework21.userAccountService;

public class User {

    private String login;
    private String password;
    private String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private boolean isCorrectOldPassword(String oldPassword) {
        return this.password.equals(oldPassword);
    }
    private boolean isValidPassword(String newPassword) {
        return newPassword.length() >= 2;
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (isCorrectOldPassword(oldPassword) && isValidPassword(newPassword)) {
            this.password = newPassword;
            System.out.println("Пароль изменен");
        } else {
            System.out.println("Ошибка при изменении пароля");
        }
    }
}
