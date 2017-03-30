package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class KataRomanNumeralsReverseTest
{
	@Test
	public void inputEmptyStringreturns0()
	{
		Assert.assertEquals(0, KataRomanNumerals.numeralToNumber(""));
	}
	
	@Test
	public void inputIreturns1()
	{
		Assert.assertEquals(1, KataRomanNumerals.numeralToNumber("I"));
	}
	
	@Test
	public void inputVreturns5()
	{
		Assert.assertEquals(5, KataRomanNumerals.numeralToNumber("V"));
	}
	
	@Test
	public void inputMreturns1000()
	{
		Assert.assertEquals(1000, KataRomanNumerals.numeralToNumber("M"));
	}
	
	@Test
	public void inputIXreturns9()
	{
		Assert.assertEquals(9, KataRomanNumerals.numeralToNumber("IX"));
	}
	
	@Test
	public void inputIIreturns2()
	{
		Assert.assertEquals(2, KataRomanNumerals.numeralToNumber("II"));
	}
	
	@Test
	public void inputXVreturns15()
	{
		Assert.assertEquals(15, KataRomanNumerals.numeralToNumber("XV"));
	}
	
	@Test
	public void inputXIVreturns14()
	{
		Assert.assertEquals(14, KataRomanNumerals.numeralToNumber("XIV"));
	}
	
	@Test
	public void inputCDXreturns410()
	{
		Assert.assertEquals(410, KataRomanNumerals.numeralToNumber("CDX"));
	}
	
	@Test
	public void inputCDVIreturns406()
	{
		Assert.assertEquals(406, KataRomanNumerals.numeralToNumber("CDVI"));
	}
	
	@Test
	public void inputMMXVIIreturns2017()
	{
		Assert.assertEquals(2017, KataRomanNumerals.numeralToNumber("MMXVII"));
	}
	
	@Test
	public void inputMCDLIXreturns1459()
	{
		Assert.assertEquals(1459, KataRomanNumerals.numeralToNumber("MCDLIX"));
	}
}
