package common;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String expression = scanner.nextLine().trim();
            if (expression.equals("/exit")) {
                System.out.println("Bye!");
                break; //stopping the scan, exit keyword entered
            }
            switch (expression) {
                case "" :
                    break;
                case "/help" :
                    Calculator.printHelp();
                    break;
                default :
                    System.out.println(Calculator.eval(expression));
                    break;
            }
        }
    }
}
