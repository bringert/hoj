package util;

import java.util.Iterator;

/**
 * An iterator that will iterate over all the values 
 * in the two supplied iterators.
 */
public class ConcatIterator<A> extends ReadOnlyIterator<A> {

   private Iterator<? extends A> it1;
   private Iterator<? extends A> it2;
   
   public ConcatIterator(Iterator<? extends A> it1, 
                         Iterator<? extends A> it2) {
      this.it1 = it1;
      this.it2 = it2;
   }
   
   public boolean hasNext () {
      return it1.hasNext() || it2.hasNext();
   }
   
   public A next () {
           if (it1.hasNext()) {
                   return it1.next();
           } else {
                   return it2.next();
           }
           // exposes bug 5037679 in javac-1.5.0-beta
           //return it1.hasNext() ? it1.next() : it2.next();
   }

}
