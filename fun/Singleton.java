package fun;

import fun.Fun;
import util.ReadOnlyIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Singleton<A> extends Fun<A,Iterator<? extends A>> {
        
        public Iterator<? extends A> apply(A x) {
                return singleton(x);
        }

        public static <A> Fun<A,Iterator<? extends A>> singleton() {
                return new Singleton<A>();
        }

        public static <A> Iterator<? extends A> singleton(A x) {
                return new SingletonIterator<A>(x);
        }

        private static class SingletonIterator<A> extends ReadOnlyIterator<A> {
                private A x;
                private boolean fresh = true;
                public SingletonIterator(A x) { this.x = x; }
                public boolean hasNext() { return fresh; }
                public A next() {
                        if (fresh) {
                                fresh = false;
                                return x;
                        } else {
                                throw new NoSuchElementException();
                        }
                }
        }

}
