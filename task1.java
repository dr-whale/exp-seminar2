import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        float userInput = getUserInput();
        System.out.println("Вы ввели число: " + userInput);
    }

    public static float getUserInput() {
        Scanner scanner = new Scanner(System.in);
        float input = 0.0f;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print("Пожалуйста, введите дробное число (типа float): ");
                input = scanner.nextFloat();
                isValidInput = true;
            } catch (java.util.InputMismatchException e) {
                // Если пользователь ввел текст вместо числа, перехватываем исключение
                System.out.println("Ошибка! Введите корректное дробное число.");
                scanner.nextLine(); // Очищаем буфер ввода
            }
        }

        scanner.close();
        return input;
    }
}