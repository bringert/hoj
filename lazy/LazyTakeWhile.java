package lazy;

import util.*;
import fun.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LazyTakeWhile<A> 
   extends Fun2<Fun<? super A,Boolean>,Iterator<? extends A>,Iterator<A>> {

   public Iterator<A> apply(Fun<? super A,Boolean> p, 
                                  Iterator<? extends A> xs) {
      return lazyTakeWhile(p, xs);
   }

   public static <A>  Fun<Iterator<? extends A>,Iterator<A>> 
   lazyTakeWhile(Fun<? super A,Boolean> p) {

      return new LazyTakeWhile<A>().apply(p);
   }

   public static <A> Iterator<A> 
   lazyTakeWhile(Fun<? super A,Boolean> p, Iterator<? extends A> xs) {

      return new LazyTakeWhileIterator<A>(p, xs);
   }

   private static class LazyTakeWhileIterator<A> extends ReadOnlyIterator<A> {
      
      private Fun<? super A,Boolean> f;
      
      private Iterator<? extends A> it;
      
      private A obj = null;
      
      public LazyTakeWhileIterator(Fun<? super A,Boolean> f, 
                                   Iterator<? extends A> it) {
         this.f = f;
         this.it = it;
      }
      
      private void getNext() {
         if (obj == null) {
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
