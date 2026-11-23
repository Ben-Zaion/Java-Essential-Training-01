// Java code​​​​​‌​​​​‌​‌​‌​‌​‌​​‌‌‌​‌​​​​​ below

/** *************************************************
 * Write your answer here, and then test your code.
 * Your job is to implement the add(), subtract(),
 * multiply(), and divide() methods.
 *************************************************** */

      public static void main(String[] args) {
        int firstNumber = 40;
        int secondNumber = 5;
        double result = Answer.calculateNumbers(firstNumber, secondNumber);
        System.out.println(result);
    }

    class Answer {

        /**
         * *************************************************
         * Change these boolean values to control whether you see the expected
         * result and/or hints.
    ***************************************************
         */
        static boolean showExpectedResult = false;
        static boolean showHints = false;

        static double calculateNumbers(int firstNumber, int secondNumber) {
            double result = 0;

            result = add(firstNumber, secondNumber);
            result = subtract(result, secondNumber);
            result = multiply(result, firstNumber);
            result = divide(result, secondNumber);

            return result;
        }

        static double add(double num1, double num2) {
            // TODO: Your code goes here
            return num1 + num2;
        }

        static double subtract(double num1, double num2) {
            // TODO: Your code goes here
            return num1 - num2;
        }

        static double multiply(double num1, double num2) {
            // TODO: Your code goes here
            return num1 * num2;
        }

        static double divide(double num1, double num2) {
            // TODO: Your code goes here
            return num1 / num2;
        }
    }
