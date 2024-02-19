package homeworks.homework21.Incapsulation.task3_SystemConfiguration;

public class SystemDemo {
    public static void main(String[] args) {


        SystemConfiguration config = new SystemConfiguration(4, "/path.....");


        int currentLogLevel = config.getLoginLevel();
        String currentLogFilePath = config.getLoginFilePath();
        System.out.println("currently login level: " + currentLogLevel);
        System.out.println("currently path to files: " + currentLogFilePath);

        config.setLoginLevel(-1);
        config.setLoginFilePath("");

        config.setLoginLevel(2);
        config.setLoginFilePath("/new/path/to/logs");

        currentLogLevel = config.getLoginLevel();
        currentLogFilePath = config.getLoginFilePath();
        System.out.println("new login level: " + currentLogLevel);
        System.out.println("new path to files: " + currentLogFilePath);
    }
}
