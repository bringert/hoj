package fun;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Function that filters a collection using a predicate.
 */
public class Filter<A> 
   extends Fun2<Fun<? super A,Boolean>, Iterator<A>,Iterator<A>> {

   public Iterator<A> apply (Fun<? super A,Boolean> f, Iterator<A> xs) {
      return filter(f, xs);
   }

   public static <A> Fun<? extends Iterator<A>,Iterator<A>> 
      filter (Fun<? super A,Boolean> f) {
      
      return new Filter<A>().apply(f);
   }

   public static <A> Iterator<A> filter(Fun<? super A,Boolean> f, 
                                              Iterator<A> xs) {
      LinkedList<A> l = new LinkedList<A>();
      while (xs.hasNext()) {
         A x = xs.next();
         if (f.apply(x).booleanValue())
            l.add(x);
      }
      return l.iterator();
   }

}
