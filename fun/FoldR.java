package fun;

import java.util.Iterator;

/**
 * Folds a list using a function, associating to the right. 
 */
public class FoldR<A,B> extends Fun3<Fun2<A,B,B>,B,Iterator<A>,B> {

   public B apply (Fun2<A,B,B> f, B y, Iterator<A> xs) {
      return foldr(f, y, xs);
   }

   public static <A,B> Fun2<B,Iterator<A>,B> foldr(Fun2<A,B,B> f) {
      return new FoldR<A,B>().apply(f);
   }
   
   public static <A,B> Fun<Iterator<A>,B> foldr(Fun2<A,B,B> f, B y) {
      return new FoldR<A,B>().apply(f, y);
   }
   
   public static <A,B> B foldr(Fun2<A,B,B> f, B y, Iterator<A> it) {
      while (it.hasNext())
         y = f.apply(it.next(), y);
      return y;
   }

}
