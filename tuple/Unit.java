package tuple;

/**
 * An immutable 0-tuple. Can be used as a dummy object.
 */
public class Unit implements Tuple {

	/**
	 * A shared instance of the unit class.
	 */
	public static final Unit UNIT = new Unit();

	public Unit () {

	}

	public boolean equals (Object o) {
		return (o != null && o instanceof Unit);
	}

	public int hashCode () {
		return 0;
	}

	/**
	 * Gets an array representation of this tuple.
	 *
	 * @return An array of length 0.
	 */
	public Object[] toArray () {
		return new Object[]{};
	}

}
