package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class KataFizzBuzzTest {
	@Test
	public void resultIsEmptyStringForNumbersOutsideBounds() {
		Assert.assertEquals("", KataFizzBuzz.fizzBuzz(0));
		Assert.assertEquals("", KataFizzBuzz.fizzBuzz(-1));
		Assert.assertEquals("", KataFizzBuzz.fizzBuzz(101));
	}
	
	@Test
	public void resultIs1forInput1() {
		Assert.assertEquals("1", KataFizzBuzz.fizzBuzz(1));
	}
	
	@Test
	public void resultIs2forInput2() {
		Assert.assertEquals("2", KataFizzBuzz.fizzBuzz(2));
	}
	
	@Test
	public void resultIsFizzforInput3() {
		Assert.assertEquals("Fizz", KataFizzBuzz.fizzBuzz(3));
	}
	
	@Test
	public void resultIs4forInput4() {
		Assert.assertEquals("4", KataFizzBuzz.fizzBuzz(4));
	}
	
	@Test
	public void resultIsBuzzforInput5() {
		Assert.assertEquals("Buzz", KataFizzBuzz.fizzBuzz(5));
	}
	
	@Test
	public void resultIsFizzforInput6() {
		Assert.assertEquals("Fizz", KataFizzBuzz.fizzBuzz(6));
	}
	
	@Test
	public void resultIs7forInput7() {
		Assert.assertEquals("7", KataFizzBuzz.fizzBuzz(7));
	}
	
	@Test
	public void resultIs8forInput8() {
		Assert.assertEquals("8", KataFizzBuzz.fizzBuzz(8));
	}
	
	@Test
	public void resultIsFizzforInput9() {
		Assert.assertEquals("Fizz", KataFizzBuzz.fizzBuzz(9));
	}
	
	@Test
	public void resultIsBuzzforInput10() {
		Assert.assertEquals("Buzz", KataFizzBuzz.fizzBuzz(10));
	}
	
	@Test
	public void resultIsFizzBuzzforInput15() {
		Assert.assertEquals("FizzBuzz", KataFizzBuzz.fizzBuzz(15));
	}
	
	@Test
	public void resultIsFizzforInput34() {
		Assert.assertEquals("Fizz", KataFizzBuzz.fizzBuzz(34));
	}
	
	@Test
	public void resultIsBuzzforInput52() {
		Assert.assertEquals("Buzz", KataFizzBuzz.fizzBuzz(52));
	}
	
	@Test
	public void resultIsFizzBuzzforInput53() { // Assumes Step 2 rules also apply to FizzBuzz
		Assert.assertEquals("FizzBuzz", KataFizzBuzz.fizzBuzz(53));
	}
}
