import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {

        int hiddenNumber = (int)(Math.random() * 100 +1); // (0.0...0.99999999) * 100 + 1

        int userNumber = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 100:");

        userNumber = scanner.nextInt();

        System.out.println("Вы ввели число " + userNumber + ". " + "Спасибо!" );


    }
}
