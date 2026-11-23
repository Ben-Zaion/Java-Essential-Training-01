// Java code​​​​​‌​​​​‌​‌​‌​‌​​‌‌​‌​​‌‌​​‌​ below

/** **********************************************************
 * Write your answer here, and then test your code.
 * Your job is to update the story variable story to read like:
 * On a [adjective] [season of the year] day, I drink a minimum
 * of [whole number] cups of coffee.
 ************************************************************ */

class Answer {

    static boolean showExpectedResult = false;
    static boolean showHints = false;

    static String fillInTheBlank(String season, int numberOfCups, String adjective) {

        String story = "On a " + adjective + " " + season
                + " day, I drink a minimum of "
                + numberOfCups + " cups of coffee.";

        return story;
    }

    public static void main(String[] args) {

        String season = "winter";
        int numberOfCups = 4;
        String adjective = "cold";

        String result = Answer.fillInTheBlank(season, numberOfCups, adjective);

        System.out.println(result);
    }
}
