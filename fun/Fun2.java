package fun;

import java.util.Iterator;
import tuple.Pair;

/**
 * Abstract class for binary functions. Binary functions are seen
 * as unary functions that return a unary function.
 */
public abstract class Fun2 <A,B,C> extends Fun<A,Fun<B,C>> {

	/**
	 * Does partial application of this function. 
	 * <code>f.apply(x).apply(y)</code> is equivalent
	 * to <code>f.apply2(x, y)</code>.
	 *
	 * @param x The value to apply the function to
	 * @return A unary function 
	 */
	public Fun<B,C> apply (final A x) {
		return new Fun<B,C>() {
			public C apply (B y) {
				return Fun2.this.apply(x, y);
			}
		};
	}

	/**
	 * Should be implemented by subclasses.
	 *
	 * @param x The first parameter.
	 * @param y The second parameter.
	 */
	public abstract C apply (A x, B y);

	/**
	 * Creates a funtion that does the same thing as this function
	 * but takes the arguments in reverse order.
	 *
	 * @return A function that applies this function to its arguments
	 * in reverse order.
	 */
	public Fun2<B,A,C> flip () {
		return Flip.flip(this);
	}

	/**
	 * Turns this function into a unary function that takes a 
	 * pair argument.
	 * <code>f.uncurry().apply(new Pair<A,B>(x, y))</code>
	 * is equivalent to <code>f.apply(x, y)</code>.
	 * 
	 * @return A unary function that takes a pair argument.
	 */
	public Fun<Pair<A,B>,C> uncurry () {
		return Uncurry.uncurry(this);
	}

	public Fun2<Iterator<A>,Iterator<B>,Iterator<C>> zipWith () {
		return ZipWith.zipWith(this);
	}

}
