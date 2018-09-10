package martak.jjdd4sprint0.task5;

public class LettersStringDoesNotContain {

    public String returnLetters(String input) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < alphabet.length(); i++) {

            if (input.indexOf(alphabet.charAt(i)) == -1) {
                output.append(alphabet.charAt(i));
            }
        }

        return output.toString();
    }

    public static void main(String[] args) {
        LettersStringDoesNotContain lettersStringDoesNotContain = new LettersStringDoesNotContain();
        System.out.println(lettersStringDoesNotContain.returnLetters("siemanko"));
    }
}
