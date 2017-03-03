package com.oriaxx77.oopexercises.fizzbuzz;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz 
{
	private IntRange range;
	private Rules rules;
	
	private FizzBuzz(){}
	
	public static FizzBuzzBuilder builder() 
	{
		return new FizzBuzzBuilder();
	}

	
	public static class FizzBuzzBuilder
	{

		private FizzBuzz fizzBuzz = new FizzBuzz();
		
		public FizzBuzzBuilder withRange(IntRange range) 
		{
			Objects.requireNonNull( range );
			fizzBuzz.range = range;
			return this;
		}

		public FizzBuzzBuilder withRules(Rules rules) 
		{
			Objects.requireNonNull( rules );
			fizzBuzz.rules = rules;
			return this;
		}

		public FizzBuzz create() {
			return fizzBuzz;
		}
		
	}


	public Stream<String> calculate() 
	{
		return IntStream.range( range.start(), range.end() ) 
				 .mapToObj( rules::evaluate );
				 
		
	}
}
