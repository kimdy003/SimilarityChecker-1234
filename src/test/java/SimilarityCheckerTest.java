import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {
    private SimilarityChecker similarityChecker;

    @BeforeEach
    void setUp() {
        similarityChecker = new SimilarityChecker();
    }

    private void assertIllegalArgument(String str1, String str2) {
        try {
            similarityChecker.similarityChecker(str1, str2);
            fail();
        } catch (IllegalArgumentException ignored) {}
    }

    @Test
    void throwIllegalArgumentExceptionInvalidInput() {
        assertIllegalArgument(null, null);
        assertIllegalArgument("ASD", "axb");
        assertIllegalArgument("ASD", "axb");
    }

    @Test
    void lengthCheckerTest() {
        String input1 = "ASD";
        String input2 = "ASD";
        int expect = 60;

        int actual = similarityChecker.similarityChecker(input1, input2);

        assertEquals(expect, actual);
    }
}