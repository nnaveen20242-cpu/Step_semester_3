package arrays_and_strings.assigment_problems;

public class WarehouseInventoryBalancer {
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        if (sectionA.length != sectionB.length) {
            System.out.println("Both sections must have equal length.");
            return;
        }

        int totalA = 0;
        int totalB = 0;
        int highest = Integer.MIN_VALUE;
        String highestSection = "";
        int highestIndex = -1;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];

            if (sectionA[i] > highest) {
                highest = sectionA[i];
                highestSection = "A";
                highestIndex = i;
            }
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                highestSection = "B";
                highestIndex = i;
            }
        }

        System.out.println("Section A total: " + totalA);
        System.out.println("Section B total: " + totalB);
        System.out.println(totalA == totalB ? "Balanced" : "Not Balanced");
        System.out.println("Highest quantity: " + highest + " in Section " + highestSection + " at index " + highestIndex);
    }

    public static void main(String[] args) {
        int[] sectionA = {10, 20, 30};
        int[] sectionB = {15, 25, 20};
        analyzeInventory(sectionA, sectionB);
    }
}
