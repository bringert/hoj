import java.util.regex.*;

import fun.*;

import static io.Interact.*;

public class Grep {
        public static void main(String[] args) {
                Matcher matcher = Pattern.compile(".*"+args[0]+".*").matcher("");
                interact(new Filter<String>().apply(new Match().apply(matcher)));
        }
}

class Match extends Fun2<Matcher,String,Boolean> {
        public Boolean apply(Matcher matcher, String s) {
                return matcher.reset(s).matches();
        }
}
