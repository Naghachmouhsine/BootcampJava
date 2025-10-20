package conditionalStatements;

public class Challenge_5 {
    public static void main(String[] args) {
        char letter = 'a';

        switch (Character.toLowerCase(letter)) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(letter + " is a vowel.");
            default -> System.out.println(letter + " is a consonant.");
        }
    }
}
