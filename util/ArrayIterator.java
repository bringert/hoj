package util;

import java.util.*;

public class ArrayIterator<A> implements Iterator<A> {

	private A[] arr;

	private int i = 0;

	public ArrayIterator (A[] arr) {
		this.arr = arr;
	}

	public boolean hasNext () {
		return i < arr.length;	
	}

	public A next () {
		if (!hasNext())
			throw new NoSuchElementException();

		return arr[i++];
	}

	public void remove () {
		throw new UnsupportedOperationException();
	}

}
