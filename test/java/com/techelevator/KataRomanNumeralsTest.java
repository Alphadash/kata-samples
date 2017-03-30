package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class KataRomanNumeralsTest {
	@Test
	public void resultIsIforInput1()
	{
		Assert.assertEquals("I", KataRomanNumerals.numberToNumeral(1));
	}
	
	@Test
	public void resultIsXforInput10()
	{
		Assert.assertEquals("X", KataRomanNumerals.numberToNumeral(10));
	}
	
	@Test
	public void resultIsCforInput100()
	{
		Assert.assertEquals("C", KataRomanNumerals.numberToNumeral(100));
	}
	
	@Test
	public void resultIsCDforInput400()
	{
		Assert.assertEquals("CD", KataRomanNumerals.numberToNumeral(400));
	}
	
	@Test
	public void resultIsDCforInput600()
	{
		Assert.assertEquals("DC", KataRomanNumerals.numberToNumeral(600));
	}
	
	@Test
	public void resultIsDCCCforInput800()
	{
		Assert.assertEquals("DCCC", KataRomanNumerals.numberToNumeral(800));
	}
	
	@Test
	public void resultIsXCVforInput95()
	{
		Assert.assertEquals("XCV", KataRomanNumerals.numberToNumeral(95));
	}
	
	@Test
	public void resultIsLXXforInput70()
	{
		Assert.assertEquals("LXX", KataRomanNumerals.numberToNumeral(70));
	}
	
	@Test
	public void resultIsXVIforInput16()
	{
		Assert.assertEquals("XVI", KataRomanNumerals.numberToNumeral(16));
	}
	
	@Test
	public void resultIsXXIVforInput24()
	{
		Assert.assertEquals("XXIV", KataRomanNumerals.numberToNumeral(24));
	}
}
