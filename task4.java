import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        try {
            String userInput = getUserInput();
            System.out.println("Вы ввели: " + userInput);
        } catch (EmptyInputException e) {
            System.out.println("Ошибка: Нельзя вводить пустые строки.");
        }
    }

    public static String getUserInput() throws EmptyInputException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String input = scanner.nextLine();
        
        if (input.isEmpty()) {
            throw new EmptyInputException();
        }

        scanner.close();
        return input;
    }
}

class EmptyInputException extends Exception {
}
