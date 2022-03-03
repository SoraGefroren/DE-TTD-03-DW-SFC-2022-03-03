package com.solucionfactible.dev;

import static org.junit.Assert.*;

import org.junit.Test;

// import static com.solucionfactible.dev.FindMissingLetter.findMissingLetter;

public class FindMissingLetterTest {

	@Test
	public void test() {
		assertEquals('e', FindMissingLetter.my_findMissingLetter(new char[] { 'a','b','c','d','f' }));
		assertEquals('m', FindMissingLetter.my_findMissingLetter(new char[] { 'k','l','n','o' }));
		assertEquals('w', FindMissingLetter.my_findMissingLetter(new char[] { 'u','v','x' }));
        assertEquals('P', FindMissingLetter.my_findMissingLetter(new char[] { 'O','Q','R','S' }));
        assertEquals('Y', FindMissingLetter.my_findMissingLetter(new char[] { 'X','Z' }));
	}

}
