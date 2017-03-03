package com.oriaxx77.oopexercises.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
public interface OutputFormatter 
{
	public String formatResult( Stream<String> result );
	
	public static OutputFormatter plainTextFormatter()
	{
		return (resultStream) -> resultStream.collect( Collectors.toList() ).toString();
	}
}
