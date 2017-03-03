package com.oriaxx77.oopexercises.fizzbuzz;

public class FizzBuzzApp 
{
	public static void main(String[] args) 
	{
		ResultPrinter.builder()
		  .withFormatter( OutputFormatter.plainTextFormatter() )
	      .withPrinter( System.out )
	      .create().print( FizzBuzz.builder().withRange( new IntRange(1, 100 ) )
									.withRules( Rules.classicRules() ).create().calculate() );
	}
}
