import java.util.Scanner;

public class Scan {
    public static void main(String args[]) {
        Scanner s = null;
        Double operand1 = null;
        Double operand2 = null;
        try {
            s = new Scanner(System.in);
            while (s.hasNext()) {
                String operator = s.next();
                if (operator.equals("q")) {
                    break;
                }
                if (operand1 == null) {
                    try {
                        operand1 = Double.valueOf(operator);
                    } catch (NumberFormatException e) {
                        System.out.println("invalid input, integer required");
                    }
                } else if (operand2 == null) {
                    try {
                        operand2 = Double.valueOf(operator);
                    } catch (NumberFormatException e) {
                        System.out.println("invalid input, integer required");
                    }
                } else {
                    if (operator.equals("*")) {
                        operand1 = operand1 * operand2;
                        operand2 = null;
                    } else if (operator.equals("/")) {
                        operand1 = operand1 / operand2;
                        operand2 = null;
                    } else if (operator.equals("+")) {
                        operand1 = operand1 + operand2;
                        operand2 = null;
                    } else if (operator.equals("-")) {
                        operand1 = operand1 - operand2;
                        operand2 = null;
                    } else {
                        System.out.println("invalid input, '*, /, +, -' required");
                    }
                }
                if(operand1 != null){
                    System.out.print("=> " + operand1);
                }
                if(operand2 != null){
                    System.out.print(", " + operand2);
                }
                System.out.println();
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
