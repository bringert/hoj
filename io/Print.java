package io;

import java.io.*;

import fun.*;
import tuple.*;

public class Print<A> extends Fun<A, Unit> {

   private PrintWriter printWriter;

   public Print(PrintWriter printWriter) {
      this.printWriter = printWriter;
   }

   public Print(Writer writer) {
      this(new PrintWriter(writer));
   }

   public Print(OutputStream outputStream) {
      this(new PrintWriter(outputStream));
   }

   public Unit apply(A o) {
      printWriter.print(o);
      return Unit.UNIT;
   }

}
