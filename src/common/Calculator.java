package common;

public class Calculator {
    public static int sum(String numbers) {
        String[] numStr = numbers.split("\\s+");
        int sum = 0;
        for (String num : numStr) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
