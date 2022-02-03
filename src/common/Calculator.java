package common;

public class Calculator {
    public static int execute(String equation) {
        String[] numStr = equation.split("\\s+");
        switch (numStr.length) {
            case 1:
                return Integer.parseInt(numStr[0]);
            case 2:
                return Integer.parseInt(numStr[0]) + Integer.parseInt(numStr[1]);
        }
        return 0;
    }
}
