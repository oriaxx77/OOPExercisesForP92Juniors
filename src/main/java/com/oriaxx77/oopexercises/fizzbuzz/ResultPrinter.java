package com.oriaxx77.oopexercises.fizzbuzz;

import java.io.PrintStream;
import java.util.stream.Stream;

public class ResultPrinter {

	private OutputFormatter outputFormatter;
	private PrintStream out;
	
	public static ResultPrinterBuilder builder() 
	{	
		return new ResultPrinterBuilder();
	}
	
	public static class ResultPrinterBuilder
	{

		private ResultPrinter resultPrinter = new ResultPrinter();
		
		public ResultPrinterBuilder withFormatter(OutputFormatter formatter) 
		{	
			resultPrinter.outputFormatter = formatter;
			return this;
		}

		public ResultPrinterBuilder withPrinter(PrintStream out) 
		{
			resultPrinter.out = out;
			return this;
		}
		
		public ResultPrinter create()
		{
			return resultPrinter;
		}
		
	}

	public void print( Stream<String> result ) {
		
		out.print( outputFormatter.formatResult(result) );
	}

}
