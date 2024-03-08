package Easy;

public class StutteringFunction {
    public static void main(String[] args) {
        stutter("incredible"); // Output: in... in... incredible?
        stutter("enthusiastic"); // Output: en... en... enthusiastic?
        stutter("outstanding"); // Output: ou... ou... outstanding?
    }

    static void stutter(String word) {

        String firstTwoLetters = word.substring(0, 2);
        String stutteredWord = firstTwoLetters + "... " + firstTwoLetters + "... " + word + "?";
        System.out.println(stutteredWord);
    }
}