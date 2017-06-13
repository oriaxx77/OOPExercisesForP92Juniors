package com.oriaxx77.oopexercises.googlesearch;

import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileRepository implements Repository<String> {

	private Path path;
	private Charset charset = Charset.forName("UTF-8");
	
	public TextFileRepository(Path path) {
		this.path = path;
	}
	
	@Override
	public void save(Result<String> result) {
		try ( Writer writer = Files.newBufferedWriter(path,charset) ){
			writer.write( result.getContent() );
		}catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
