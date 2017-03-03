package com.oriaxx77.oopexercises.fizzbuzz;

@FunctionalInterface
public interface Rules {

	public String evaluate( int i );
	
	public static Rules classicRules() {
		return (i) -> { if ( i % 3 == 0 && i %5 == 0 ) return "FizzBuzz";
						else if ( i % 5 == 0 ) return "Buzz";
						else if ( i % 3 == 0 ) return "Fizz";
						else return Integer.toString( i ); };
	}

}
