package fun;

public class Apply<A,B> extends Fun2<Fun<? super A,B>,A,B> {

   public B apply(Fun<? super A,B> f, A x) {
      return f.apply(x);
   }

   // FIXME: add static versions

}
