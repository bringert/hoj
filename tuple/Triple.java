package tuple;

/**
 * An immutable 3-tuple.
 */
public class Triple <A,B,C> extends Pair<A,Pair<B,C>> implements Tuple {

   public Triple (A x, B y, C z) {
      super(x, new Pair<B,C>(y, z));
   }
   
   public A get1 () {
      return fst;
   }
   
   public B get2() {
      return snd.fst;
   }
   
   public C get3 () {
      return snd.snd;
   }
   
   public String toString() {
      return "Triple(" + get1() + ", " + get2() + "," + get3() + ")";
   }
   
   /**
    * Gets an array representation of this triple.
    *
    * @return A 2-element array containing the elements of
    * this pair in order. 
    */
   public Object[] toArray () {
      return new Object[]{ fst, snd.fst, snd.snd };
   }

}
