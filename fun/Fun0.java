package fun;

import util.*;

import java.util.Iterator;

/**
 * Abstract class for nullary functions.
 */
public abstract class Fun0<A> {

   /**
    * Should be overridden by subclasses to apply the function.
    *
    * @return The result of the function
    */
   public abstract A apply ();

   /**
    * Returns an iterator that will apply this function forever.
    *
    * @return An iterator whose hasNext() method will always return true
    * and whose next() method returns the result of applying the function.
    */
   public Iterator<A> repeat() {
      return new ReadOnlyIterator<A>() {
         public boolean hasNext() { return true; }
         public A next() { return apply(); }
      };
   }

   public static <A> Fun0<A> constant(A x) {
      return generator(new Id<A>(), x);
   }

   public static <A,B> Fun0<B> generator(final Fun<A,B> f, final A x) {
      return new Fun0<B>() {
         public B apply() {
            return f.apply(x);
         }
      };
   }

}
