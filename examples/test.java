import fun.*;
import io.*;

public class test {

   public static void main(String[] args) {
      Fun<Object,Integer> hash = new Fun<Object,Integer>() {
         public Integer apply(Object o) {
            return new Integer(o.hashCode());
         }
      };

      hash.map(new ReadLine(System.in).repeat());
   }

}
