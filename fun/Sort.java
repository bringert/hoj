package fun;

import util.SortIterator;

import java.util.Iterator;

public class Sort<A extends Comparable<A>> 
        extends Fun<Iterator<A>,Iterator<A>> {

        public Iterator<A> apply(Iterator<A> xs) {
                return new SortIterator<A>(xs);
        }

        public static <A extends Comparable<A>> 
          Fun<Iterator<A>,Iterator<A>> sort() {
                return new Sort<A>();
        }

}
