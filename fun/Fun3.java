package fun;

/**
 * Base class for ternary functions.
 */
public abstract class Fun3 <A,B,C,D> extends Fun<A,Fun2<B,C,D>>  {

   /**
    * Applies this function to one argument, returning
    * a binary function.
    */
   public Fun2<B,C,D> apply (final A x) {
      return new Fun2<B,C,D>() {
         public D apply (B y, C z) {
            return Fun3.this.apply(x, y, z);
         }
      };
   }
   
   /**
    * Applies this function to two arguments, returning
    * a unary function.
    */
   public Fun<C,D> apply (A x, B y) {
      return apply(x).apply(y);
   }
   
   /**
    * Applies this function to three arguments, returning
    * the result.
    */
   public abstract D apply (A x, B y, C z);
   
}
