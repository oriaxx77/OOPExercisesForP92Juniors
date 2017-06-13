package com.oriaxx77.oopexercises.googlesearch;

public class SimpleResult<T> implements Result<T> {

	private T content;
	
	public SimpleResult( T content) {
		this.content = content;
	}
	
	@Override
	public T getContent() {
		return content;
	}

}
