package fun;

import java.util.Iterator;

public class Find<A> 
   extends Fun2<Fun<? super A,Boolean>,Iterator<? extends A>,A> {

   public A apply(Fun<? super A,Boolean> p, Iterator<? extends A> xs) {
      while (xs.hasNext()) {
         A x = xs.next();
         if (p.apply(x))
            return x;
      }
      return null;
   }

   // FIXME: add static versions

}
