package fun;

import tuple.Pair;

public class Curry<A,B,C> extends Fun3<Fun<Pair<? super A,? super B>,C>,A,B,C> {

   public C apply (Fun<Pair<? super A,? super B>,C> f, A x, B y) {
      return curry(f, x, y);
   }

   /**
    * Converts a function that takes a Pair argument to a function that
    * takes two arguments.
    * @param f The function.
    * @return A function g such that g(x,y) is the same as f(&lt;x,y&gt>)
    */
   public static <A,B,C> Fun2<A,B,C> curry (Fun<Pair<? super A,? super B>,C> f) {
      return new Curry<A,B,C>().apply(f);
   }
   
   public static <A,B,C> Fun<B,C> curry (Fun<Pair<? super A,? super B>,C> f, A x) {
      return new Curry<A,B,C>().apply(f, x);
   }
   
   /**
    * Applies a function that takes a Pair argument to two values.
    * @param f The function.
    * @param x The first value.
    * @param y The second value.
    * @return f(&lt;x,y&gt;)
    */
   public static <A,B,C> C curry (Fun<Pair<? super A,? super B>,C> f, A x, B y) {
      return f.apply(new Pair<A,B>(x, y));
   }

}
