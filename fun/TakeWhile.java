package fun;

import java.util.*;

public class TakeWhile<A> 
   extends Fun2<Fun<? super A,Boolean>,Iterator<? extends A>,Iterator<A>> {

   public Iterator<A> apply(Fun<?super A,Boolean> p, 
                                  Iterator<? extends A> xs) {
      return takeWhile(p, xs);
   }

   public static <A> Fun<Iterator<? extends A>,Iterator<A>> takeWhile(
      Fun<? super A,Boolean> p) {

      return new TakeWhile<A>().apply(p);
   }

   public static <A> Iterator<A> takeWhile(Fun<? super A,Boolean> p, 
                                                 Iterator<? extends A> xs) {

      LinkedList<A> l = new LinkedList<A>();

      while (xs.hasNext()) {
         A a = xs.next();
         if (p.apply(a).booleanValue()) {
            l.add(a);
         } else {
            break;
         }
      }

      return l.iterator();
   }

}
