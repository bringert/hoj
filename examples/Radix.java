import fun.Fun;

/**
 * Example 3.1 from "Pizza into Java: Translating theory into practise"
 * by Martin Odersky and Philip Walder.
 */
class Radix {

   int n = 0;
   
   Fun<Character,Boolean> radix (final int r) {
      return new Fun<Character,Boolean> () {
         public Boolean apply (Character c) {
            n++;
            return new Boolean('0' <= c.charValue() 
                               && c.charValue() < '0'+r);
         }
      };
   }
   
   String test () {
      Fun<Character,Boolean> f = radix(8);
      return f.apply(new Character('0')) + " " 
         + f.apply(new Character('9')) + " " + n;
   }
   
   public static void main (String[] args) {
      System.out.println(new Radix().test());
   }
}
