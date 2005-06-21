package fun;

import util.*;

import java.util.Iterator;

/**
 *  Base class for nullary functions.
 */
public abstract class Fun0<A> {

        /**
         * Should be overridden by subclasses to apply the function.
         *
         * @return The result of the function
         */
        public abstract A apply ();
        
        /**
         * Returns an iterator that will apply this function forever.
         *
         * @return An iterator whose hasNext() method will always return true
         * and whose next() method returns the result of applying the function.
         */
        public Iterator<A> repeat() {
                return new ReadOnlyIterator<A>() {
                        public boolean hasNext() { return true; }
                        public A next() { return apply(); }
                };
        }
        
        /** 
         *  Create a nullary function which always returns
         *  the same value.
         */
        public static <A> Fun0<A> constant(final A x) {
                return new Fun0<A>() {
                        public A apply() {
                                return x;
                        }
                };
        }

        /**
         *  Create a nullary function with, when called, applies
         *  a unary function to an argument and returns the result.
         */
        public static <A,B> Fun0<B> lazy(final Fun<A,B> f, final A x) {
                return new Fun0<B>() {
                        public B apply() {
                                return f.apply(x);
                        }
                };
        }

}
