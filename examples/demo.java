/*
 * Prints the sum of the lengths of its command line arguments.
 */

import fun.*;
import util.*;

import java.util.*;

public class demo {

	static Fun<String,Integer> length = 
           new MemberFun<String, Integer>("length");

	static Fun2<Integer,Integer,Integer> add =
		new Fun2<Integer,Integer,Integer> () {
			public Integer apply (Integer x, Integer y) {
				return new Integer(x.intValue()+y.intValue());
			}
		};

	static Fun<Iterator<Integer>,Integer> sum = 
           FoldR.foldr(add, new Integer(0));

	public static void main (String[] args) {
		System.out.println(
                   sum.apply(length.map(ArrayUtil.iterator(args))));
	}

}
