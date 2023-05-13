package gr.upatras.junit.ask1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PosTest {
	@Test
	void testDiff() {
		assertEquals("POSITIVE", Pos.diff(10, 5), "10 - 5 must be positive");
	}
}
