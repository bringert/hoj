package fun;

import fun.*;

public class Eq<A> extends Fun2<A,A,Boolean> {

   public Boolean apply(A x, A y) {
      return eq(x, y);
   }

   public static <A> Fun<A,Boolean> eq(A x) {
      return new Eq<A>().apply(x);
   }

   public static <A> Boolean eq(A x, A y) {
      if (x == null)
         return Boolean.valueOf(y == null);

      return Boolean.valueOf(x.equals(y));
   }

}
