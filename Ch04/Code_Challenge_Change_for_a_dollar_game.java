// Java code​​​​​‌​​​​‌​‌​‌​‌‌​​‌‌‌‌​​‌‌​‌​ below

/** *************************************************
 * Write your answer here, and then test your code.
 * Your job is to use a decision structure to test if
 * the number of coins equals 1.00.
 *************************************************** */

      public static void main(String[] args) {
        int numOfPennies = 10;
        int numOfNickels = 3;
        int numOfDimes = 5;
        int numOfQuarters = 1;

        boolean won = Answer.isADollar(numOfPennies, numOfNickels, numOfDimes, numOfQuarters);

        System.out.println(won);
    }

    class Answer {

        /**
         * *************************************************
         * Change these boolean values to control whether you see the expected
         * result and/or hints.
         * **************************************************
         */
        static boolean showExpectedResult = false;
        static boolean showHints = false;

        static boolean isADollar(int numOfPennies, int numOfNickels, int numOfDimes, int numOfQuarters) {
            /**
             * *************************************************
             * Value of each coin
             * **************************************************
             */
            double penny = 0.01;
            double nickel = 0.05;
            double dime = 0.10;
            double quarter = 0.25;
            double dollar = 1.00;

            boolean won = false;

            double total = (numOfPennies * penny) + (numOfNickels * nickel) + (numOfDimes * dime) + (numOfQuarters * quarter);

            if (total == dollar) {
                won = true;
            }
            return won;
        }

    }
