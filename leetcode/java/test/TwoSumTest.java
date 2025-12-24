import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class TwoSumTest {
    record TestCase(int[] input, int target, int[] expected) {}

    static Stream<TestCase> provideTestCases() {
        return Stream.of(
                new TestCase(new int[]{2,7,11,15}, 9, new int[]{0,1}),
                new TestCase(new int[]{3,2,4}, 6, new int[]{1,2}),
                new TestCase(new int[]{3,3}, 6, new int[]{0,1}),
                new TestCase(new int[]{2,5,5,11}, 10, new int[]{1,2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testSolveWithTwoPointers(TestCase tc) {
        TwoSum ts = new TwoSum();
        assertArrayEquals(tc.expected, ts.solveWithTwoPointers(tc.input, tc.target));
    }


}