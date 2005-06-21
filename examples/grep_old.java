package examples;

import java.io.*;
import java.util.regex.*;

public class grep_old {
        public static void main(String[] args) {
                Matcher matcher = Pattern.compile(".*"+args[0]+".*").matcher("");
                BufferedReader in = 
                        new BufferedReader(new InputStreamReader(System.in));
                try { 
                        String line;
                        while ((line = in.readLine()) != null)
                                if (matcher.reset(line).matches()) {
                                        System.out.println(line);
                                }
                } catch (IOException ex) {}
        }
}
