package com.oriaxx77.oopexercises.googlesearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class GoogleSearchEngine implements SearchEngine<String> {
	
	private static final String googleApi = "http://www.google.com/search?q=";
	private static final String charset = "UTF-8";
	
	@Override
	public Result<String> lookFor(String search) {
		
		try {
		    
			URL url = new URL( googleApi + URLEncoder.encode( search, charset) );
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestProperty( "User-Agent" , "Mozilla/5.0" );
			
		    StringBuilder result = new StringBuilder();
		    try ( BufferedReader reader = new BufferedReader( new InputStreamReader(connection.getInputStream(), charset) ) ){
		    	String line;
		    	while ( (line = reader.readLine()) != null ) {
		    		result.append( line );
		    	}
		    }
		    return new SimpleResult<String>( result.toString() );
		
		} catch ( IOException e ){
			throw new RuntimeException( e );
		}
	}

}
