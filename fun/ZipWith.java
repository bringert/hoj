package fun;

import java.util.Iterator;
import java.util.LinkedList;

public class ZipWith<A,B,C> 
   extends Fun3<Fun2<A,B,C>,Iterator<A>,Iterator<B>,Iterator<C>> {
   
   public Iterator<C> apply (Fun2<A,B,C> f, Iterator<A> xs,Iterator<B> ys) {
      return zipWith(f, xs, ys);
   }
   
   public static <A,B,C> 
      Fun2<Iterator<A>,Iterator<B>,Iterator<C>> zipWith (Fun2<A,B,C> f) {
      
      return new ZipWith<A,B,C>().apply(f);
   }
   
   public static <A,B,C> Fun<Iterator<B>,Iterator<C>> zipWith (
      Fun2<A,B,C> f, Iterator<A> xs) {
      
      return new ZipWith<A,B,C>().apply(f, xs);
   }
   
   public static <A,B,C> Iterator<C> zipWith (
      Fun2<A,B,C> f, Iterator<A> xs, Iterator<B> ys) {
      
      LinkedList<C> l = new LinkedList<C>();
      while (xs.hasNext() && ys.hasNext())
         l.add(f.apply(xs.next(), ys.next()));
      return l.iterator();
   }

}
