package examples;

import java.io.*;

public class wc_old {
        public static void main(String[] args) {
                int i = 0;
                BufferedReader in = 
                        new BufferedReader(
                                new InputStreamReader(System.in));
                try { 
                        for (; in.readLine() != null; i++);
                } catch (IOException ex) {}
                System.out.println(i);
        }
}
