package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class KataRomanNumerals {
	private static Map<Integer, String> numeralByValue;

	public static String numberToNumeral(int i)
	{
		fillNumeralByValue(); // Saves execution time at the cost of a small additional memory footprint
		if (numeralByValue.containsKey(i)) return numeralByValue.get(i);
		
		return buildRomanString(i);
	}
	
	public static int numeralToNumber(String string)
	{
		if (string.equals("")) return 0;
		
		fillNumeralByValue();
		if (numeralByValue.containsValue(string)) return RomanNumeral.valueOf(string).getValue();
		
		List<String> numeralList = new ArrayList<String>();
		for (char c : string.toCharArray()) numeralList.add(String.valueOf(c));
		Iterator<String> iter = numeralList.iterator();
		
		int result = 0;
		int firstNumeralValue = RomanNumeral.valueOf(iter.next()).getValue();
		int secondNumeralValue;
		while (iter.hasNext())
		{
			secondNumeralValue = RomanNumeral.valueOf(iter.next()).getValue();
			if (firstNumeralValue >= secondNumeralValue)
			{
				result += firstNumeralValue;
				if (!iter.hasNext()) result += secondNumeralValue;
				else firstNumeralValue = secondNumeralValue;
			}
			else
			{
				result += secondNumeralValue - firstNumeralValue;
				if (iter.hasNext())
				{
					firstNumeralValue = RomanNumeral.valueOf(iter.next()).getValue();
					
					// When we look at a firstNumeralValue that's smaller than secondNumeralValue, we drop both of them from consideration
					// If we have two or more numerals after that, the loop continues
					// But if we have only one numeral remaining, we need to ensure it gets added to the result
					if (!iter.hasNext()) result += firstNumeralValue;
				}
			}
		}
		return result;
	}
	
	private static String buildRomanString(int i)
	{
		StringBuilder result = new StringBuilder();
		
		for (RomanNumeral numeral : RomanNumeral.values())
		{
			while (i >= numeral.getValue())
			{
				result.append(numeral.toString());
				i -= numeral.getValue();
			}
		}
		
		return result.toString();
	}
	
	private static void fillNumeralByValue()
	{
		if (numeralByValue == null)
		{
			numeralByValue = new HashMap<Integer, String>();
			
			for (RomanNumeral numeral : RomanNumeral.values())
			{
				numeralByValue.put(numeral.getValue(), numeral.toString());
			}
		}
	}
	
	private enum RomanNumeral
	{
		M(1000), CM(900), D(500), CD(400), C(100), XC(90), L(50), XL(40), X(10), IX(9), V(5), IV(4), I(1);
		
		private int value;
		
		private RomanNumeral(int value)
		{
			this.value = value;
		}
		
		public int getValue()
		{
			return value;
		}
	}
}
