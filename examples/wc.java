import static fun.Singleton.*;
import static fun.Size.*;
import static io.Interact.*;

import fun.*;
import java.util.Iterator;

public class wc {
        public static void main(String[] args) {
                interact(singleton().compose(size()));
        }
}
