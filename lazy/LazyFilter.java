package lazy;

import fun.*;
import util.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Function that filters a collection using a predicate.
 */
public class LazyFilter<A> 
   extends Fun2<Fun<? super A,Boolean>,Iterator<? extends A>,Iterator<A>> {

   public Iterator<A> apply (Fun<? super A,Boolean> f, 
                                   Iterator<? extends A> xs) {
      return lazyFilter(f, xs);
   }

   public static <A> Fun<Iterator<? extends A>,Iterator<A>> 
   lazyFilter (Fun<? super A,Boolean> f) {
      
      return new LazyFilter<A>().apply(f);
   }

   public static <A> Iterator<A> lazyFilter(Fun<? super A,Boolean> f, 
                                                  Iterator<? extends A> xs) {
      return new LazyFilterIterator<A>(f, xs);
   }

   private static class LazyFilterIterator<A> extends ReadOnlyIterator<A> {
      
      private Fun<? super A,Boolean> f;
      
      private Iterator<? extends A> it;
      
      private A obj = null;
      
      public LazyFilterIterator(Fun<? super A,Boolean> f, 
                                Iterator<? extends A> it) {
         this.f = f;
         this.it = it;
      }
      
      private void getNext() {
         while (obj == null) {
            if (!it.hasNext())
               return;
            
            A newObj = it.next();
            if (f.apply(newObj).booleanValue())
               obj = newObj;
         }
      }
      
      public boolean hasNext() {
         getNext();
         return obj != null;
      }
      
      public A next() {
         if (!hasNext())
            throw new NoSuchElementException();
         
         A ret = obj;
         obj = null;
         return ret;
      }
   
   }

}
