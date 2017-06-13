package com.oriaxx77.oopexercises.googlesearch;

public interface SearchEngine<T> {

	Result<T> lookFor(String string);

}
