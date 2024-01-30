package homeworks.homework6;

public class StringDemo {
    public static void main(String[] args) {

        String myString = new String("I study Basic Java!");

        // Шаг 2: Передайте строку в метод
        printLastCharacter(myString);

        // Шаг 3: Распечатать последний символ строки
        printLastCharacter(myString);

        // Шаг 4: Проверить, содержит ли строка подстроку "Java"
        checkSubstring(myString);

        // Шаг 5: Заменить все символы "а" на "о"
        replaceCharacters(myString);

        // Шаг 6: Преобразовать строку к верхнему регистру
        toUpperCase(myString);

        // Шаг 7: Преобразовать строку к нижнему регистру
        toLowerCase(myString);

        // Шаг 8: Вырезать строку "Java"
        substringExample(myString);
    }

    // Метод для печати последнего символа строки
    private static void printLastCharacter(String str) {
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);
    }

    // Метод для проверки наличия подстроки "Java"
    private static void checkSubstring(String str) {
        boolean containsJava = str.contains("Java");
        System.out.println("Строка содержит подстроку 'Java': " + containsJava);
    }

    // Метод для замены символов "а" на "о"
    private static void replaceCharacters(String str) {
        String replacedString = str.replace('a', 'o');
        System.out.println("Строка после замены символов 'a' на 'o': " + replacedString);
    }

    // Метод для преобразования строки к верхнему регистру
    private static void toUpperCase(String str) {
        String upperCaseString = str.toUpperCase();
        System.out.println("Строка в верхнем регистру: " + upperCaseString);
    }

    // Метод для преобразования строки к нижнему регистру
    private static void toLowerCase(String str) {
        String lowerCaseString = str.toLowerCase();
        System.out.println("Строка в нижнем регистру: " + lowerCaseString);
    }

    // Метод для вырезания подстроки "Java"
    private static void substringExample(String str) {
        String substringResult = str.substring(str.indexOf("Java"), str.indexOf("Java") + 4);
        System.out.println("Вырезанная подстрока: " + substringResult);
    }
}
