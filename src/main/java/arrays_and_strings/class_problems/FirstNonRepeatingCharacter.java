package arrays_and_strings.class_problems;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char result = findFirstNonRepeating(text);
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }

        scanner.close();
    }

    static char findFirstNonRepeating(String text) {
        for (int i = 0; i < text.length(); i++) {
            boolean repeated = false;
            for (int j = 0; j < text.length(); j++) {
                if (i != j && text.charAt(i) == text.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                return text.charAt(i);
            }
        }
        return '\0';
    }
}
