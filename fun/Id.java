package fun;

/**
 * The identity function.
 */
public class Id<A> extends Fun<A,A> {
   
   /**
    * Calls <code>Funs.id(x)</code>
    */
   public A apply(A x) {
      return id(x);
   }

   public static <A> Id<A> id() {
      return new Id<A>();
   }

   /**
    * Returns its argument.
    *
    */
   public static <A> A id(A x) {
      return x;
   }

}
