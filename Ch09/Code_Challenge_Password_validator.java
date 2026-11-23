// Java code​​​​​‌​​​​‌​‌​‌​‌‌​‌​‌‌‌​​‌‌‌‌‌ below

/** *******************************************************
 * Write your answer here, and then test your code.
 * Your job is to implement the validatePassword() method.
 ********************************************************* */

class Answer {

    public static void main(String[] args) {
        String newPassword = "P@ssw0rd";
        boolean result = Answer.validatePassword(newPassword);
        System.out.println("Is the new password valid? " + result);
    }
    /**
     * *************************************************
     * Change these boolean values to control whether you see the expected
     * result and/or hints.
    ***************************************************
     */
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Current credentials
    static String username = "jane_doe";
    static String currentPassword = "passw0rd";

    static boolean validatePassword(String newPassword) {

        /**
         * *************************************************
         * TODO: Your code goes here
         *
         * Criteria: at least 8 characters long contains an uppercase letter
         * contains a special character does not contain the username is not the
         * same as the old password
         */
        boolean hasLength = newPassword.length() >= 8;

        boolean hasUppercase = !newPassword.equals(newPassword.toLowerCase());

        boolean hasSpecialCharacter = !newPassword.matches("[a-zA-Z0-9]*");

        boolean doesNotContainUsername = !newPassword.contains(username);

        boolean isNotOldPassword = !newPassword.equals(currentPassword);

        return hasLength
                && hasUppercase
                && hasSpecialCharacter
                && doesNotContainUsername
                && isNotOldPassword;
    }

}
