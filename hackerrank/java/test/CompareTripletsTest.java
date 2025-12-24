import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class CompareTripletsTest {
    record TestCase(List<Integer> a, List<Integer> b, List<Integer> expected) {}

    static Stream<TestCase> provideTestCases() {
        return Stream.of(
                new TestCase(Arrays.asList(5,6,7), Arrays.asList(3,6,10), Arrays.asList(1,1)),
                new TestCase(Arrays.asList(1,2,3), Arrays.asList(3,2,1), Arrays.asList(1,1)),
                new TestCase(Arrays.asList(17,28,30), Arrays.asList(99,16,8), Arrays.asList(2,1))
        );
    }

    /*
    @BeforeEach
    void setUp() throws Exception {
        ts = new TwoSum(new int[]{2,7,11,15},9);
    }*/
   /*
	@Test
	void test() {
		Assert.assertArrayEquals(new int[]{0,1}, ts.solve());
		//fail("Not yet implemented");
	}*/
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testSolveWithTwoPointers(TestCase tc) {
        assertEquals(tc.expected, CompareTriplets.compareWithIterator(tc.a, tc.b));
    }
}