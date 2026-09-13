package arrays_and_strings.assigment_problems;

public class MovieReviewWordLengthProfiler {
    public static void classifyWordLengths(String review) {
        String[] words = review.trim().split("\\s+");
        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        for (String word : words) {
            int length = word.length();
            if (length >= 1 && length <= 4) {
                shortWords++;
            } else if (length <= 8) {
                mediumWords++;
            } else {
                longWords++;
            }
        }

        System.out.println("Short words (1-4): " + shortWords);
        System.out.println("Medium words (5-8): " + mediumWords);
        System.out.println("Long words (9+): " + longWords);
    }

    public static void main(String[] args) {
        classifyWordLengths("This movie was absolutely wonderful and entertaining");
    }
}
