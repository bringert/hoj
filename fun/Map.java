package fun;

import java.util.*;

public class Map<A,B> 
        extends Fun2<Fun<A,B>,Iterator<? extends A>,Iterator<B>> {

   public Iterator<B> apply(Fun<A,B> f, Iterator<? extends A> x) {
      return map(f, x);
   }

   public static <A,B> Fun<Iterator<? extends A>,Iterator<B>> map(Fun<A,B> f) {
      return new Map<A,B>().apply(f);
   }
   
   public static <A,B> Iterator<B> map(Fun<A,B> f, Iterator<? extends A> xs) {
      LinkedList<B> l = new LinkedList<B>();
      while (xs.hasNext())
         l.add(f.apply(xs.next()));
      return l.iterator();
   }

}
