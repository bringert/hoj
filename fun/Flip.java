package fun;

public class Flip<A,B,C> extends Fun3<Fun2<? super A,? super B,? extends C>,B,A,C> {

   public C apply (Fun2<? super A,? super B,? extends C> f, B x, A y) {
      return flip(f, x, y);
   }

   public static <A,B,C> Fun2<B,A,C> flip (Fun2<? super A,? super B,? extends C> f) {
      return new Flip<A,B,C>().apply(f);
   }
   
   public static <A,B,C> Fun<A,C> flip (Fun2<? super A,? super B,? extends C> f, B b) {
      return new Flip<A,B,C>().apply(f, b);
   }
   
   public static <A,B,C> C flip (Fun2<? super A,? super B,? extends C> f, B b, A a) {
      return f.apply(a, b);
   }	

}
