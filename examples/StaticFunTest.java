package examples;

import fun.*;


public class StaticFunTest {

	public static void main (String[] args) {
		if (args.length != 2) {
			System.err.println(
				"Usage: java StaticFunTest <math func> <double>");
			System.exit(1);
		}

		Fun<Double, Double> f = new StaticFun<Double,Double>(
			Math.class, args[0] , double.class);
		System.out.println(f.apply(new Double(Double.parseDouble(args[1]))));
	}

}
