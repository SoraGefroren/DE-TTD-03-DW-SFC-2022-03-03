package com.solucionfactible.dev;

import static org.junit.Assert.*;

import org.junit.Test;

// import static com.solucionfactible.dev.Persistence.persistence;

public class PersistenceTest {

	@Test
	public void tests() {
		assertEquals(3, Persistence.my_persistence(39));
		assertEquals(0, Persistence.my_persistence(4));
		assertEquals(4, Persistence.my_persistence(999));
		
		assertEquals(1, Persistence.my_persistence(10));
		assertEquals(2, Persistence.my_persistence(25));
		assertEquals(3, Persistence.my_persistence(39));
		assertEquals(4, Persistence.my_persistence(77));
		assertEquals(5, Persistence.my_persistence(679));
		assertEquals(6, Persistence.my_persistence(6788));
		assertEquals(7, Persistence.my_persistence(68889));
		assertEquals(8, Persistence.my_persistence(2677889));
		assertEquals(9, Persistence.my_persistence(26888999));
		assertEquals(10, Persistence.my_persistence(3778888999l));
	}

}
