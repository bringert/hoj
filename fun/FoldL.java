package fun;

import java.util.Iterator;

/**
 * Folds a list using a function, associating to the left. 
 */
public class FoldL<A,B> extends Fun3<Fun2<B,A,B>,B,Iterator<A>,B> {

   public B apply (Fun2<B,A,B> f, B y, Iterator<A> xs) {
      return foldl(f, y, xs);
   }

  public static <A,B> Fun2<B,Iterator<A>,B> foldl (Fun2<B,A,B> f) {
      return new FoldL<A,B>().apply(f);
   }
   
   public static <A,B> Fun<Iterator<A>,B> foldl (Fun2<B,A,B> f, B y) {
      return new FoldL<A,B>().apply(f, y);
   }
   
   public static <A,B> B foldl(Fun2<B,A,B> f, B y, Iterator<A> it) {
      while (it.hasNext())
         y = f.apply(y, it.next());
      return y;
   }
}
