public class SimilarityChecker {
    public void similarityChecker(String str){
        assertIllegalArgument(str);
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
