// Java code​​​​​‌​​​​‌​‌​‌​‌​‌​​‌‌​​​​​‌‌​ below
/***************************************************
Write your answer here, and then test your code.
Your job is to use a repetition structure to roll a die
up to 5 times to advance a gameboard.
****************************************************/ 

import java.util.Random;

public static void main(String[] args) {
        String result = Answer.playGame();
        System.out.println(result);
    }

class Answer {

    /***************************************************
    Change these boolean values to control whether you see
    the expected result and/or hints.
    ****************************************************/ 
    static boolean showExpectedResult = false;
    static boolean showHints = false;
   
    static String playGame() {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();
        String tooLow = "You're on space %d. Sorry, you lose!";
        String tooHigh = "You've exceeded %d spaces. Sorry, you lose!";
        String justRight = "You're on space %d. Congrats, you win!";
        

        /*
         TODO: Your code goes here. 
         Use the following for your return statements within the loop:

         return String.format(justRight, currentSpace);
         return String.format(tooHigh, lastSpace);
         return String.format(tooLow, currentSpace);
        */
       for (int i = 0; i < maxRolls; i++) {

            int roll = random.nextInt(6) + 1;

            currentSpace += roll;

            if (currentSpace == lastSpace) {
                return String.format(justRight, currentSpace);
            }

            if (currentSpace > lastSpace) {
                return String.format(tooHigh, lastSpace);
            }
        }

        return String.format(tooLow, currentSpace);
    }

}
