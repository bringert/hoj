package fun;

import fun.*;

public class StringValue<A> extends Fun<A, String> {

        public String apply(A x) {
                return x.toString();
        }

        public static <A> Fun<A,String> stringValue() {
                return new StringValue<A>();
        }

}
