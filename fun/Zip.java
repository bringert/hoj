package fun;

import tuple.Pair;

import java.util.Iterator;
import java.util.LinkedList;

public class Zip<A,B> extends Fun2<Iterator<A>,Iterator<B>,
                                   Iterator<Pair<A,B>>> {

   public Iterator<Pair<A,B>> apply (Iterator<A> xs, 
                                           Iterator<B> ys) {
      return zip(xs, ys);
   }
   
   public static <A,B> Fun<Iterator<B>,Iterator<Pair<A,B>>> 
      zip (Iterator<A> xs) {
      
      return new Zip<A,B>().apply(xs);
   }
   
   public static <A,B> Iterator<Pair<A,B>> 
           zip(Iterator<A> xs, Iterator<B> ys) {
      
      LinkedList<Pair<A,B>> l = new LinkedList<Pair<A,B>>();
      while (xs.hasNext() && ys.hasNext())
			l.add(new Pair<A,B>(xs.next(), ys.next()));
      return l.iterator();
   }
   

}
