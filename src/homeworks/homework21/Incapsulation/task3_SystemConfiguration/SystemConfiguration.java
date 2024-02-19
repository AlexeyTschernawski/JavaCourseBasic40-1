package homeworks.homework21.Incapsulation.task3_SystemConfiguration;

public class SystemConfiguration {

    // Примеры конфигурационных параметров
    private int loginLevel;  // уровень логирования
    private String LoginFilePath;  // путь к файлам логов

    // Конструктор класса
    public SystemConfiguration(int initialLogLevel, String initialLogFilePath) {
        setLoginLevel(initialLogLevel);
        setLoginFilePath(initialLogFilePath);
    }

    // Метод для установки уровня логирования
    public void setLoginLevel(int newLoginLevel) {
        if (isValidLogLevel(newLoginLevel)) {
            this.loginLevel = newLoginLevel;
        } else {
            System.out.println("ERROR: not correct login level.");
        }
    }
    private boolean isValidLogLevel(int logLevel) {
        return logLevel >= 0 && logLevel <= 8;
    }
    public int getLoginLevel() {
        return loginLevel;
    }
    public void setLoginFilePath(String newLogFilePath) {
        if (isValidLogFilePath(newLogFilePath)) {
            this.LoginFilePath = newLogFilePath;
        } else {
            System.out.println("Ошибка: not correct path to files.");
        }
    }
    private boolean isValidLogFilePath(String logFilePath) {
        return logFilePath != null && !logFilePath.isEmpty();
    }
    public String getLoginFilePath() {
        return LoginFilePath;
    }
}

