package fun;

import java.util.Iterator;

/**
 * Abstract class for unary functions.
 */
public abstract class Fun <A,B> {

   /**
    * Should be overridden by subclasses to apply the function.
    *
    * @param x The function parameter.
    * @return The result of the function
    */
   public abstract B apply (A x);
   
   /**
    * Composes this function with another function.
    * <code>f.compose(g).apply(x)</code> is equivalent to
    * <code>f.apply(g.apply(x))</code>
    *
    * @param f The function to compose this function with
    * @return The composed function
    */
   public <C> Fun<C,B> compose (final Fun<? super C, ? extends A> f) {
      return Compose.compose(this, f);
   }
   
   /**
    * Applies this function to all the element returned by an iterator.
    * 
    */
   public Iterator<B> map(Iterator<? extends A> xs) {
      return Map.map(this, xs);
   }

   /**
    * Convenience method, same as <code>map(xs.iterator())</code>.
    */
   public Iterator<B> map (Iterable<? extends A> xs) {
      return map(xs.iterator());
   }

}
