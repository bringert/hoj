package fun;

import tuple.Pair;

import java.util.Iterator;
import java.util.LinkedList;

public class Unzip<A,B> 
   extends Fun<Iterator<Pair<A,B>>, 
               Pair<Iterator<A>,Iterator<B>>> {
   
   public Pair<Iterator<A>,Iterator<B>> apply (Iterator<Pair<A,B>> ps) {

      return unzip(ps);
   }
   
   public static <A,B> Pair<Iterator<A>,Iterator<B>> unzip (
      Iterator<Pair<A,B>> ps) {
      
      LinkedList<A> xs = new LinkedList<A>();
      LinkedList<B> ys = new LinkedList<B>();
      
      while (ps.hasNext()) {
         Pair<A,B> p = ps.next();
         xs.add(p.fst);
         ys.add(p.snd);
      }
      return new Pair<Iterator<A>,Iterator<B>>(xs.iterator(), ys.iterator());
   }

}
