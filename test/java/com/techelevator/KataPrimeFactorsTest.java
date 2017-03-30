package com.techelevator;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class KataPrimeFactorsTest {
	@Test
	public void resultIs2forInput2()
	{
		List<Integer> result = KataPrimeFactors.factorize(2);
		Assert.assertEquals(1, result.size());
		Assert.assertEquals(2, result.get(0).intValue());
	}
	
	@Test
	public void resultIs2_2forInput4()
	{
		List<Integer> result = KataPrimeFactors.factorize(4);
		Assert.assertEquals(2, result.size());
		Assert.assertEquals(2, result.get(0).intValue());
		Assert.assertEquals(2, result.get(1).intValue());
	}
	
	@Test
	public void resultIs3forInput3()
	{
		List<Integer> result = KataPrimeFactors.factorize(3);
		Assert.assertEquals(1, result.size());
		Assert.assertEquals(3, result.get(0).intValue());
	}
	
	@Test
	public void resultIs2_3forInput6()
	{
		List<Integer> result = KataPrimeFactors.factorize(6);
		Assert.assertEquals(2, result.size());
		Assert.assertEquals(2, result.get(0).intValue());
		Assert.assertEquals(3, result.get(1).intValue());
	}
	
	@Test
	public void resultIs7forInput7()
	{
		List<Integer> result = KataPrimeFactors.factorize(7);
		Assert.assertEquals(1, result.size());
		Assert.assertEquals(7, result.get(0).intValue());
	}
	
	@Test
	public void resultIs2_2_2forInput8()
	{
		List<Integer> result = KataPrimeFactors.factorize(8);
		Assert.assertEquals(3, result.size());
		Assert.assertEquals(2, result.get(0).intValue());
		Assert.assertEquals(2, result.get(1).intValue());
		Assert.assertEquals(2, result.get(2).intValue());
	}
	
	@Test
	public void resultIs3_3forInput9()
	{
		List<Integer> result = KataPrimeFactors.factorize(9);
		Assert.assertEquals(2, result.size());
		Assert.assertEquals(3, result.get(0).intValue());
		Assert.assertEquals(3, result.get(1).intValue());
	}
	
	@Test
	public void resultIs2_5forInput10()
	{
		List<Integer> result = KataPrimeFactors.factorize(10);
		Assert.assertEquals(2, result.size());
		Assert.assertEquals(2, result.get(0).intValue());
		Assert.assertEquals(5, result.get(1).intValue());
	}
	
	@Test
	public void resultIs2_2_2_2_3forInput48()
	{
		List<Integer> result = KataPrimeFactors.factorize(48);
		Assert.assertEquals(5, result.size());
		Assert.assertEquals(2, result.get(0).intValue());
		Assert.assertEquals(2, result.get(1).intValue());
		Assert.assertEquals(2, result.get(2).intValue());
		Assert.assertEquals(2, result.get(3).intValue());
		Assert.assertEquals(3, result.get(4).intValue());
	}
	
	@Test
	public void resultIs3_3_2_5forInput90()
	{
		List<Integer> result = KataPrimeFactors.factorize(90);
		Assert.assertEquals(4, result.size());
		Assert.assertEquals(2, result.get(0).intValue());
		Assert.assertEquals(3, result.get(1).intValue());
		Assert.assertEquals(3, result.get(2).intValue());
		Assert.assertEquals(5, result.get(3).intValue());
	}
	
	@Test
	public void resultIs3_7_7forInput147() // This tests expanding the primeSet
	{
		List<Integer> result = KataPrimeFactors.factorize(147);
		Assert.assertEquals(3, result.size());
		Assert.assertEquals(3, result.get(0).intValue());
		Assert.assertEquals(7, result.get(1).intValue());
		Assert.assertEquals(7, result.get(2).intValue());
	}
}
