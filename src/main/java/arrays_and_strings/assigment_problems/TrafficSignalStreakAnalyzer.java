package arrays_and_strings.assigment_problems;

public class TrafficSignalStreakAnalyzer {
    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("Signal log is empty.");
            return;
        }

        char longestSignal = signalLog.charAt(0);
        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
                longestSignal = signalLog.charAt(i);
            }
        }

        System.out.println("Signal color: " + longestSignal);
        System.out.println("Longest streak: " + longestStreak);
    }

    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
    }
}
