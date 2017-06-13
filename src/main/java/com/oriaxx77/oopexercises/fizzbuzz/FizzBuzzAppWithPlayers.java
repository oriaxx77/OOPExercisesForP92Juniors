package com.oriaxx77.oopexercises.fizzbuzz;

import java.util.stream.Stream;

public class FizzBuzzAppWithPlayers 
{

	static class Player implements Runnable
	{
		
		@Override
		public void run() 
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
	
	public static void main(String[] args) 
	{
		for ( int i = 0; i < 3; i++ )
		{
			new Thread( new Player() ).start();
		}
	}


}
