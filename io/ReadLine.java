package io;

import java.io.*;

import fun.*;

public class ReadLine extends Fun0<String> {

        private BufferedReader in;

        public ReadLine(InputStream in) {
                this(new InputStreamReader(in));
        }

        public ReadLine(Reader in) {
                this(new BufferedReader(in));
        }

        public ReadLine(BufferedReader in) {
                this.in = in;
        }

        public String apply() {
                try {
                        return in.readLine();
                } catch (IOException ex) {
                        return null;
                }
        }
        
}
