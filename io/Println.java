package io;

import java.io.*;

import fun.*;
import tuple.*;

public class Println extends Fun<Object, Unit> {

        private PrintWriter printWriter;
        
        public Println(Writer writer) {
                // Turns on autoflushing to make sure no output is lost
                // on VM termination, see bug 4034972
                printWriter = new PrintWriter(writer, true);
        }
        
        public Println(OutputStream outputStream) {
                // Turns on autoflushing to make sure no output is lost
                // on VM termination, see bug 4034972
                printWriter = new PrintWriter(outputStream, true);
        }
        
        public Unit apply(Object o) {
                printWriter.println(o);
                return Unit.UNIT;
        }

        public static Fun<Object,Unit> println(Writer writer) {
                return new Println(writer);
        }

        public static Fun<Object,Unit> println(OutputStream stream) {
                return new Println(stream);
        }

}
