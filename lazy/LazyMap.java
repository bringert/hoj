package lazy;

import java.util.Iterator;

import util.*;
import fun.*;

public class LazyMap<A,B> 
   extends Fun2<Fun<A,B>,Iterator<? extends A>,Iterator<B>> {

   public Iterator<B> apply(Fun<A,B> f, Iterator<? extends A> x) {
      return lazyMap(f, x);
   }

   public static <A,B> 
      Fun<Iterator<? extends A>,Iterator<B>> lazyMap(Fun<A,B> f) {

      return new LazyMap<A,B>().apply(f);
   }
   
   public static <A,B> 
      Iterator<B> lazyMap(Fun<A,B> f, Iterator<? extends A> xs) {

      return new LazyMapIterator<A,B>(f, xs);
   }

   private static class LazyMapIterator<A,B> extends ReadOnlyIterator<B> {
      private Fun<A,B> f;
      private Iterator<? extends A> it;

      public LazyMapIterator(Fun<A,B> f, Iterator<? extends A> it) {
         this.f = f;
         this.it = it;
      }

      public boolean hasNext() { 
         return it.hasNext(); 
      }
      
      public B next() { 
         return f.apply(it.next()); 
      }
   }

}
