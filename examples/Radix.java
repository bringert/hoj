package examples;

import fun.Fun;

/**
   Example 3.1 from "Pizza into Java: Translating theory into practise"
   by Martin Odersky and Philip Walder.

class Radix {
  int n = 0;
  (char)->boolean radix(int r) {
    return fun boolean(char c) {
      n++; return '0' <= c && c < '0' + r;
    }
  }
  String test () {
    (char)->boolean f = radix(8);
    return f('0')+" "+f('9')+" "+n;
  }
}

 */
class Radix {

   int n = 0;
   
   Fun<Character,Boolean> radix (final int r) {
      return new Fun<Character,Boolean> () {
         public Boolean apply (Character c) {
            n++;
            return '0' <= c && c < '0' + r;
         }
      };
   }
   
   String test () {
      Fun<Character,Boolean> f = radix(8);
      return f.apply('0') + " " + f.apply('9') + " " + n;
   }
   
   public static void main (String[] args) {
      System.out.println(new Radix().test());
   }
}
