package fun;

/**
 * Base class for functions which take 4 arguments.
 */
public abstract class Fun4 <A,B,C,D,E> extends Fun<A,Fun3<B,C,D,E>> {
   
   public Fun3<B,C,D,E> apply (final A x) {
      return new Fun3<B,C,D,E>() {
         public E apply (B y, C z, D w) {
            return Fun4.this.apply(x, y, z, w);
         }
      };
   }
   
   public Fun2<C,D,E> apply (A x, B y) {
      return apply(x).apply(y);
   }
   
   public Fun<D,E> apply (A x, B y, C z) {
      return apply(x).apply(y).apply(z);
   }
   
   public abstract E apply (A x, B y, C z, D w);
   
}
