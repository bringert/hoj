package fun;

import tuple.Pair;

public class Uncurry<A,B,C> extends Fun2<Fun2<A,B,C>,Pair<A,B>,C> {

   public C apply (Fun2<A,B,C> f, Pair<A,B> p) {
      return uncurry(f, p);
   }
   
   public static <A,B,C> Fun<Pair<A,B>,C> uncurry (Fun2<A,B,C> f) {
      return new Uncurry<A,B,C>().apply(f);
   }
   
   public static <A,B,C> C uncurry (Fun2<A,B,C> f, Pair<A,B> p) {
      return f.apply(p.fst, p.snd);
   }

}
