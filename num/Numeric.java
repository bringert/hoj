package num;

public interface Numeric<A> extends Comparable<A> {
   public A negate();
   public A add(A x);
   public A subtract(A x);
   public A multiply(A x);
   public A divide(A x);
}
