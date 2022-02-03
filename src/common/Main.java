package common;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String equation = scanner.nextLine();
            if (equation.equals("/exit")) {
                System.out.println("Bye!");
                break;
            }
            if (!equation.isBlank()) {
                System.out.println(Calculator.execute(equation));
            }
        }
    }
}
