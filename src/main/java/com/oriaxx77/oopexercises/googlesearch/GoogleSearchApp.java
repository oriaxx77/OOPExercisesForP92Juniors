package com.oriaxx77.oopexercises.googlesearch;
 
import java.nio.file.Paths;

public class GoogleSearchApp {
	
	
	
	public static void main(String[] args) {
		
		SearchEngine<String> searchEngine = new GoogleSearchEngine();
		Result<String> result = searchEngine.lookFor( "stackoverflow" );
		
		String path = "./result.html";
		Repository<String> repository = new TextFileRepository( Paths.get( path ) ); 
		repository.save( result );
		System.out.println( "Please check: " +path );
	}
}
