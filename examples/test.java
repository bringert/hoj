import fun.*;
import io.*;

import java.util.Iterator;

import static fun.Map.*;

public class test {

        public static void test1() {
                Fun<Object,Integer> hash = new Fun<Object,Integer>() {
                        public Integer apply(Object o) {
                                return new Integer(o.hashCode());
                        }
                };
                
                hash.map(new ReadLine(System.in).repeat());
        }

        public static <A> Iterator<? extends A> cast(Iterator<A> it) {
                return it;
        }

        public static void test2(Iterator<String> it) {
                Iterator<? extends String> io = it;
                while (io.hasNext()) {
                        String s = io.next();
                }
        }

        public static void test3(){
                Fun<Object,Boolean> isNull = null;
                Iterator<String> is = null;
                Iterator<Boolean> ib = map(isNull, is);
        }

        public static void main(String[] args) {
                
        }

}
