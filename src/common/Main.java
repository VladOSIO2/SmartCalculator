package common;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (scanner.hasNext()) {
            String equation = scanner.nextLine();
            switch (equation.trim()) {
                case "/exit" :
                    System.out.println("Bye!");
                    exit = true;
                    break;
                case "" :
                    break;
                case "/help" :
                    System.out.println("The program calculates the sum of numbers");
                    break;
                default :
                    System.out.println(Calculator.sum(equation));
            }
            if (exit) {
                break;
            }
        }
    }
}
