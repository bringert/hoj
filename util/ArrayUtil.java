package util;

import java.util.Iterator;
import java.lang.reflect.Array;

public class ArrayUtil {

	public static <A> A[] newInstance(A[] arr, int length) {
		return (A[])Array.newInstance(arr.getClass().getComponentType(), length);
	}

	public static <A> Iterator<A> iterator (A[] arr) {
		return new ArrayIterator<A>(arr);
	}

}
