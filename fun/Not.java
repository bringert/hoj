package fun;

import fun.*;

public class Not extends Fun<Boolean,Boolean> {

   public Boolean apply(Boolean x) {
      return not(x);
   }

   public static Not not() {
      return new Not();
   }

   public static Boolean not(Boolean x) {
      return !x;
   }

}
