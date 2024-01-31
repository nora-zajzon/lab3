import static org.junit.Assert.*;
import org.junit.*;
public class LinkedListTests {
	@Test 
	public void testPrepend() {
        Node node1;
	}


    @Test
    public void testReversed() {
        int[] input1 = {1,2,3,4};
        assertArrayEquals(new int[]{4,3,2,1}, ArrayExamples.reversed(input1));

        int[] input2 = {3, 1, 4, 3, 5};
        assertArrayEquals(new int[]{5, 3, 4, 1, 3}, ArrayExamples.reversed(input2));
    }

}
