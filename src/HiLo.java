import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {

        int hiddenNumber = (int)(Math.random() * 100 +1); // (0.0...0.99999999) * 100 + 1

        int userNumber = 0;

        Scanner scanner = new Scanner(System.in);

        while (userNumber != hiddenNumber) {

            System.out.println("Введите число от 1 до 100:");

            userNumber = scanner.nextInt();

            if (userNumber < hiddenNumber){

                System.out.println( userNumber +  " меньше загаданного. Ввведите еще число");

            } else if (userNumber > hiddenNumber) {

                System.out.println(userNumber + " больше загаданного. Введите еще число");

            }else {

                System.out.println(userNumber + " это загаданное число. Вы победили!");

            }


        }

    }
}
