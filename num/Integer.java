package num;

public class Integer extends Number implements Integral<Integer> {

   private int n;

   public Integer(int n) {
      this.n = n;
   }

   public int intValue() { return n; }

   public long longValue() { return n; }

   public float floatValue() { return (float)n; }

   public double doubleValue() { return (double)n; }

   public int compareTo(Integer x) { return n - x.n; }

   public Integer negate() { return new Integer(-n); }
   public Integer add(Integer x) { return new Integer(n + x.n); }
   public Integer subtract(Integer x) { return new Integer(n - x.n); }
   public Integer multiply(Integer x) { return new Integer(n * x.n); }
   public Integer divide(Integer x){ return new Integer(n / x.n); }

   public Integer mod(Integer x) { return new Integer(n % x.n); }
   public Integer not() { return new Integer(~n); }
   public Integer and(Integer x) { return new Integer(n & x.n); }
   public Integer or(Integer x) { return new Integer(n | x.n); }
   public Integer xor(Integer x) { return new Integer(n ^ x.n); }
}
