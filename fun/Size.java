package fun;

import fun.*;

import java.util.Iterator;

public class Size<A> extends Fun<Iterator<? extends A>,Integer> {

        public Integer apply(Iterator<? extends A> xs) {
                return size(xs);
        }

        public static <A> Fun<Iterator<? extends A>,Integer> size() {
                return new Size<A>();
        }

        public static <A> Integer size(Iterator<? extends A> xs) {
                int i;
                for (i = 0; xs.hasNext(); i++)
                        xs.next();
                return i;
        }

}
