package strings.class_problems;

public class BankTransactionReferenceValidator {
    public static String normalizeReference(String raw) {
        String reference = raw.trim();
        if (reference.length() < 3) {
            return reference;
        }
        return reference.substring(0, 3).toUpperCase() + reference.substring(3);
    }

    public static String validateAndFormat(String reference) {
        if (reference.length() != 14) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        String bank = reference.substring(0, 3);
        String date = reference.substring(3, 9);
        String sequence = reference.substring(9, 14);

        StringBuilder result = new StringBuilder();
        result.append("[").append(bank).append("] DATE: ");
        result.append(date.substring(0, 2)).append("/");
        result.append(date.substring(2, 4)).append("/");
        result.append(date.substring(4, 6));
        result.append(" | SEQ: ").append(sequence);
        return result.toString();
    }

    public static void main(String[] args) {
        String reference = normalizeReference(" hdf03022600042 ");
        System.out.println(validateAndFormat(reference));
    }
}
