package examples;

import java.util.regex.*;

import fun.*;

import static io.Interact.*;

public class Grep {
        public static void main(String[] args) {

                final Matcher matcher 
                        = Pattern.compile(".*"+args[0]+".*").matcher("");

                Fun<String,Boolean> match = new Fun<String,Boolean>() {
                        public Boolean apply(String s) {
                                return matcher.reset(s).matches();
                        }
                };

                interact(new Filter<String>().apply(match));
        }
}
