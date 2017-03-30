package com.techelevator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class KataPrimeFactors
{
	private static Set<Integer> primeSet = new LinkedHashSet<Integer>(); // LinkedHashSet retains ordering of elements which we will use
	private static int currentUpperBoundForPrimeSet = 0;

	public static List<Integer> factorize(int i)
	{
		List<Integer> resultList = new ArrayList<Integer>();
		return factorizeRecursively(i, resultList);
	}
	
	private static List<Integer> factorizeRecursively(int i, List<Integer> listToPopulate)
	{

		if (isPrime(i)) listToPopulate.add(i);
		else
		{
			for (int prime : primeSet)
			{
				if (i % prime == 0)
				{
					listToPopulate.add(prime);
					factorizeRecursively(i / prime, listToPopulate);
					break;
				}
			}
		}
		return listToPopulate;
	}
	
	private static boolean isPrime(int i)
	{
		buildPrimeSet(i);
		return primeSet.contains(i);
	}

	private static void buildPrimeSet(int upperBound)
	{
		if (upperBound > currentUpperBoundForPrimeSet) // Only rebuild the primeset if we can't ensure all primes upto and including upperBound are in the set
		{
			if (upperBound < 100) upperBound = 100; // Always build the primeset up to at least 100, this lets us run our test cases without rebuilding the set
			currentUpperBoundForPrimeSet = upperBound;
			
			// Use Sieve of Eratosthenes to populate primeSet
			Set<Integer> notPrimes = new HashSet<Integer>(); 
			for (int i = 2; i <= upperBound; i++)
			{
				if (!notPrimes.contains(i))
				{
					primeSet.add(i);
					for (int j = i * 2; j <= upperBound; j += i)
					{
						notPrimes.add(j);
					}
				}
			}
		}
	}
}
