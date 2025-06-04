import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    void throwIllegalArgumentExceptionInvalidInput() {
        assertIllegalArgument(null, null);
        assertIllegalArgument("ASD", "axb");
        assertIllegalArgument("ASD", "axb");
    }

    @Test
    void lengthCheckerTest() {
        int expect = 60;
        int actual = similarityChecker.similarityChecker("ASD", "ASD");
        assertEquals(expect, actual);
    }

    @Test
    void lengthCheckerTest2() {
        int expect = 60;
        int actual = similarityChecker.similarityChecker("ASD", "DSA");
        assertEquals(expect, actual);
    }

    @Test
    void lengthCheckerTest3() {
        int expect = 0;
        int actual = similarityChecker.similarityChecker("A", "BB");
        assertEquals(expect, actual);
    }

    @Test
    void lengthCheckerTest4() {
        int expect = 20;
        int actual = similarityChecker.similarityChecker("AAABB", "BAA");
        assertEquals(expect, actual);
    }
}