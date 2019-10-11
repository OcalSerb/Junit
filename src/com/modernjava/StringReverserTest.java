package com.modernjava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringReverserTest {

	@Test
	void testReverser() {
		
		StringReverser reverser = new StringReverser();
		assertEquals("thgislarulP", reverser.reverse("Pluralsight"));
	}

}
