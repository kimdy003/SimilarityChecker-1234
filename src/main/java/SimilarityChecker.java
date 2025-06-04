public class SimilarityChecker {
    public int similarityChecker(String input1, String input2) {
        assertIllegalArgument(input1);
        assertIllegalArgument(input2);

        return (int) lengthChecker(input1, input2);
    }

    private double lengthChecker(String input1, String input2) {
        swapFirstMoreThanLength(input1, input2);
        int len1 = input1.length();
        int len2 = input2.length();
        if (len1 == len2) return 60;
        if (len1 >= len2 * 2) return 0;

        int gap = len1 - len2;
        return (1 - ((double) gap / len2)) * 60;
    }

    private static void swapFirstMoreThanLength(String input1, String input2) {
        if (input1.length() < input2.length()) {
            String temp = input2;
            input2 = input1;
            input1 = temp;
        }
    }

    private static void assertIllegalArgument(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }

        for (char number : str.toCharArray()) {
            if (number < 'A' || number > 'Z') {
                throw new IllegalArgumentException();
            }
        }
    }
}
