package fun;

/**
 * A binary function that simply returns its first argument. To get a 
 * function that returns its second argument, use:
 * <code>new Const<A,B>().flip()</code>
 */
public class Constant<A,B> extends Fun2<A,B,A> {

   /**
    * Returns the first argument. That is,
    * <code>new Const<A,B>().apply(x,y) == x</code> is true.
    *
    * @param x The first argument
    * @param y The second argument
    * @return x
    */
   public A apply(A x, B y) {
      return constant(x, y);
   }

   /**
    * Creates a constant function.
    *
    * @return A function that will return x, whatever argument it is
    * applied to.
    */
   public static <A,B> Fun<B,A> constant(A x) {
      return new Constant<A,B>().apply(x);
   }
   
   /**
    * Applies the constant function.
    */
   public static <A,B> A constant(A x, B y) {
      return x;
   }

}
