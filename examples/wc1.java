import fun.*;
import io.*;
import java.util.Iterator;

import static fun.Singleton.*;
import static fun.Size.*;

public class wc1 {
        public static void main(String[] args) {
                new Interact().apply(new Compose<Iterator<? extends String>,Integer,Iterator<? extends Integer>>().apply(new Singleton<Integer>(),new Size<String>()));
        }
}
