package num;

public interface Integral<A> extends Numeric<A> {
   public A mod(A x);
   public A not();
   public A and(A x);
   public A or(A x);
   public A xor(A x);
}
