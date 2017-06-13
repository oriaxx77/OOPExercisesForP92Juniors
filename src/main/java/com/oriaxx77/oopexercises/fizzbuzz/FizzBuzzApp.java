    package com.oriaxx77.oopexercises.fizzbuzz;

import java.util.stream.Stream;

public class FizzBuzzApp 
{
	public static void main(String[] args) 
	{
		FizzBuzz fizzBuzz = FizzBuzz.builder()
									.withRange( new IntRange(1, 100 ) )
									.withRules( Rules.classicRules() )
									.create();
		
		Stream<String> result = fizzBuzz.calculate();
		
		ResultPrinter resultPrinter = ResultPrinter.builder()
		  .withFormatter( OutputFormatter.plainTextFormatter() )
	      .withPrinter( System.out )
	      .create();
	      
	    resultPrinter.print( result );
	}
}

