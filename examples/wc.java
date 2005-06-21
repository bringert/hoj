package examples;

import java.util.Iterator;

import static fun.Singleton.singleton;
import static fun.Size.size;
import static io.Interact.interact;

public class wc {
        public static void main(String[] args) {
                interact(singleton().compose(size()));
        }
}
