package util;

import java.util.Iterator;
import java.util.List;
import java.util.Collections;

/**
 * An iterator that will iterate over all the values 
 * in the two supplied iterators.
 */
public class SortIterator<A extends Comparable<A>> 
        extends ReadOnlyIterator<A> {

        private Iterator<A> it;
   
        public SortIterator(Iterator<A> xs) {
                List<A> list = CollectionUtil.toList(xs);
                Collections.sort(list);
                this.it = list.iterator();
        }
   
        public boolean hasNext () {
                return it.hasNext();
        }
   
        public A next () {
                return it.next();
        }

}
