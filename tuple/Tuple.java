package tuple;

/**
 * Interface implemented by all tuples.
 *
 * Tuples should be immutable.
 */
public interface Tuple {

	/**
	 * Returns an array representation of this tuple.
	 * Subclasses must return an array of length equal to
	 * the number of elements in this tuple, containg the elements
	 * of the tuple in order.
	 *
	 * Modification of the array must not affect the tuple. 
	 */
	public Object[] toArray ();

}
