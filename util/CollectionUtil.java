package util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class CollectionUtil {

   /**
    * Adds all the elements from an iterator to a collection.
    */
   public static <A> void addAll(Collection<A> dest, 
                                 Iterator<? extends A> src) {
      while (src.hasNext())
         dest.add(src.next());
   }

   /**
    * Creates a List containing all the elements from an Iterator.
    */
   public static <A> List<A> toList(Iterator<A> src) {
           LinkedList<A> l = new LinkedList<A>();
           addAll(l, src);
           return l;
   }
   
   /**
    * Gets all the elements from an iterator and does nothing with them.
    */
   public static void getAll(Iterator<?> it) {
      while (it.hasNext()) 
         it.next();
   }

}
