package io;

import java.io.*;
import java.util.Iterator;

import fun.*;

import static lazy.LazyTakeWhile.*;
import static fun.Not.*;
import static fun.Eq.*;

public class ReadLines extends Fun<BufferedReader,Iterator<String>> {

        public Iterator<String> apply(BufferedReader in) {
                return readLines(in);
        }

        public static Iterator<String> readLines(BufferedReader in) {
                return lazyTakeWhile(not().compose(eq(null)), 
                                     new ReadLine(in).repeat());
        }

        public static Iterator<String> readLines(Reader in) {
                return readLines(new BufferedReader(in));
        }

        public static Iterator<String> readLines(InputStream in) {
                return readLines(new InputStreamReader(in));
        }

}
