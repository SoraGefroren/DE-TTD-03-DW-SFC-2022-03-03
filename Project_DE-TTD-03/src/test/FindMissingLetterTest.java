package test;

import static test.FindMissingLetter.findMissingLetter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMissingLetterTest {

	@Test
	void test() {
		assertEquals('e', findMissingLetter(new char[] { 'a','b','c','d','f' }));
		assertEquals('m', findMissingLetter(new char[] { 'k','l','n','o' }));
		assertEquals('w', findMissingLetter(new char[] { 'u','v','x' }));
        assertEquals('P', findMissingLetter(new char[] { 'O','Q','R','S' }));
        assertEquals('Y', findMissingLetter(new char[] { 'X','Z' }));
	}

}
