package num;

import java.util.Iterator;

public class Numbers {

   public <A extends Numeric<A>> A sum(Iterator<A> it) {
      A total = null;
      while (it.hasNext()) {
         A val = it.next();
         total = total == null ? val : total.add(val);
      }
      return total;
   }

}
