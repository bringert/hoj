package util;

import java.util.Iterator;

public abstract class ReadOnlyIterator<A> implements Iterator<A> {

        public void remove() {
                throw new UnsupportedOperationException();
        }

}
