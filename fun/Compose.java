package fun;

/**
 * The function composition function.
 */
public class Compose<A,B,C> 
   extends Fun3<Fun<? super B,? extends C>,Fun<? super A, ? extends B>,A,C> {
   
   public C apply (Fun<? super B,? extends C> f, Fun<? super A, ? extends B> g, A x) {
      return compose(f, g, x);
   }
   
   /**
    * Applies compose to one argument.
    */
   public static <A,B,C> Fun2<Fun<? super A, ? extends B>,A,C> compose (Fun<? super B, ? extends C> f) {
      return new Compose<A,B,C>().apply(f);
   }
   
   /**
    * Composes two functions
    * @param f The first function.
    * @param g The second function.
    * @return the functions that when applied to a value a will return
    * f(g(a))
    */
   public static <A,B,C> Fun<A,C> compose (Fun<? super B,? extends C> f, Fun<? super A, ? extends B> g) {
      return new Compose<A,B,C>().apply(f, g);
   }
   
   /**
    * Applies the composition of two functions to an argument.
    * @param f The first function.
    * @param g The second function.
    * @param a The value to apply the the composed function to.
    * @return f(g(a))
    */
   public static <A,B,C> C compose (Fun<? super B,? extends C> f, Fun<? super A, ? extends B> g, A a) {
      return f.apply(g.apply(a));
   }

}
