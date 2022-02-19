package common;

public class Calculator {
    private enum Operand {
        PLUS,
        MINUS,
        UNDEFINED
    }
    public static int eval(String expression) {
        if (expression == null) {
            return 0;
        }
        String[] components = expression.split("\\s+");
        int result = Integer.parseInt(components[0]);
        //considering each even element is a number, and each odd one is an operand
        //we dont need to loop on each element and check what is it
        for (int i = 2; i < components.length; i += 2) {
            result = evalMin(result, resolveOperand(components[i-1]), Integer.parseInt(components[i]));
        }
        return result;
    }

    private static int evalMin(int a, Operand op, int b) {
        switch (op) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
        }
        return 0;
    }

    private static Operand resolveOperand(String operand) {
        if (operand.matches("\\++")) {
            //input operand is '+...+'
            return Operand.PLUS;
        } else if (operand.matches("-+")) {
            return operand.length() % 2 == 0 ?
                    Operand.PLUS // 2 -- 2 == 2 - (-2) == 2 + 2
                    : Operand.MINUS; // 2 --- 2 == 2 -(-(-2)) == 2 - 2
        }
        return Operand.UNDEFINED;
    }

    public static void printHelp() {
        System.out.println("The program evaluates the expression\n" +
                "it accepts a line of expression and outputs the result\n" +
                "possible operands: addition '+'; subtraction '-'\n" +
                "Example:\n" +
                "I: 5 ++ 6 --- 4 + 15\n" +
                "O: 22\n" +
                "any amount of '+' considered as addition\n" +
                "even amount of '-' considered as addition too, odd amount - as subtraction\n" +
                "keywords: '/exit' - exit from program, '/help' - get help about what program is doing"
        );
    }
}
