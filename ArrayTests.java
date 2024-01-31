import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = { 1,2,3,4};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 4,3,2,1}, input2);

    int[] input3 = { 1,3,4};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 4,3,1}, input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1,2,3,4};
    assertArrayEquals(new int[]{4,3,2,1}, ArrayExamples.reversed(input1));

    int[] input2 = {3, 1, 4, 3, 5};
    assertArrayEquals(new int[]{5, 3, 4, 1, 3}, ArrayExamples.reversed(input2));
  }
}
