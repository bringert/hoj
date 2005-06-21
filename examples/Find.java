package examples;

import fun.*;

public class Find {

	public static <A> int find (Fun<A, Boolean> p, A[] xs) {
		for (int i = 0; i < xs.length; i++) {
			if (p.apply(xs[i]).booleanValue())
				return i;
		}

		return -1;
	}

	public static void main (String[] args) {
		Fun<String,Boolean> startsWithFoo = new StartsWith().flip().apply("foo");

		int i = find(startsWithFoo, args);
		if ( i != -1)
			System.out.println(args[i]);
	}

}
