import java.util.Objects;

public class SimilarityChecker {
    public int similarityChecker(String input1, String input2){
        assertIllegalArgument(input1);
        assertIllegalArgument(input2);

        return lengthChecker(input1, input2);
    }

    private int lengthChecker(String input1, String input2) {
        if (Objects.equals(input1, input2)) return 60;
        return 0;
    }

    private static void assertIllegalArgument(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }

        for (char number : str.toCharArray()) {
            if (number < 'A' || number > 'Z') {
                throw new IllegalArgumentException();
            }
        }
    }
}
