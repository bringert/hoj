package lazy;

import fun.*;
import util.CollectionUtil;

import java.util.Iterator;
import java.util.LinkedList;

public class Strict<A> 
   extends Fun<Iterator<? extends A>,Iterator<A>> {

   public Iterator<A> apply(Iterator<? extends A> xs) {
      return strict(xs);
   }

   public static <A> Iterator<A> strict(Iterator<? extends A> xs) {
      LinkedList<A> l = new LinkedList<A>();
      CollectionUtil.addAll(l, xs);
      return l.iterator();
   }

}
