package tuple;

import util.ArrayUtil;

import java.util.Collection;
import java.util.Iterator;

/**
 * An immutable 2-tuple.
 */
public class Pair <A,B> implements Tuple {

   /**
    * The first component.
    */
   public final A fst;
   
   /**
    * The second component.
    */
   public final B snd;
   
   /**
    * Creates a new pair.
    *
    * @param fst The first component.
    * @param fst The second component.
    */
   public Pair (A fst, B snd) {
      this.fst = fst;
      this.snd = snd;
   }

   /**
    * Compares this pair to another object for equality.
    *
    * @param o The object to compare this pair with.
    * @return true iff o is not null and o is a Pair and 
    * the components of this and o are pairwise equal or both null.
    */
   public boolean equals (Object o) {
      if (o != null && o instanceof Pair) {
         Pair p = (Pair)o;
         return (fst == null ? p.fst == null : fst.equals(p.fst)) 
            && (snd == null ? p.snd == null : snd.equals(p.snd));
      }
      
      return false;
   }
   
   /**
    * Returns a hash code for this pair. The hash code is calculated from
    * the hash codes of the components.
    */
   public int hashCode () {
      return (fst == null ? 0 : fst.hashCode()) 
         ^ (snd == null ? 0 : snd.hashCode());
   }
   
   public String toString() {
      return "Pair(" + fst + ", " + snd +  ")";
   }

   /**
    * Gets an array representation of this pair.
    *
    * @return A 2-element array containing the elements of
    * this pair in order. 
    */
   public Object[] toArray () {
      return new Object[]{ fst, snd };
   }
}
