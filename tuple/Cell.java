package tuple;

/**
 * An immutable 1-tuple. Provided for completeness.
 */
public class Cell<A> implements Tuple {

   public final A data;
   
   public Cell (A data) {
      this.data = data;
   }
   
   public boolean equals (Object o) {
      if (o != null && o instanceof Cell) {
         Cell c = (Cell)o;
         return (data == null ? c.data == null : data.equals(c.data));
      }
      
      return false;
   }
   
   public int hashCode () {
      return data == null ? 0 : data.hashCode();
   }

   public String toString() {
      return "Cell(" + data + ")";
   }
   
   /**
    * Gets an array representation of this tuple.
    *
    * @return An array of length 1, containg data.
    */
   public Object[] toArray () {
      return new Object[]{ data };
   }
   
}
