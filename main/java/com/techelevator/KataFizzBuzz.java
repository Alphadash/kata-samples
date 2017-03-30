package com.techelevator;

public class KataFizzBuzz {

	public static String fizzBuzz(int number)
	{
		if (number < 1 || number > 100) return "";
		
		String stringNumber = "" + number;
		String result = "";
		
		if (number % 3 == 0 || stringNumber.contains("3")) result += "Fizz";
		if (number % 5 == 0 || stringNumber.contains("5")) result += "Buzz";
		
		return result.isEmpty() ? stringNumber : result;
	}

}
