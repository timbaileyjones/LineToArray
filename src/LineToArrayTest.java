import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineToArrayTest {
	@Test
	final void testGetIntArrayFromLine() {
		Integer [] arr = LineToArray.getIntArrayFromLine("2 4 6 8");
		assertNotNull(arr);
		assert(arr.length == 4);
		assert(arr[0] == 2);
		assert(arr[1] == 4);
		assert(arr[2] == 6);
		assert(arr[3] == 8);
	}

}
