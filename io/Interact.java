package io;

import fun.*;
import lazy.*;
import tuple.Unit;

import java.util.Iterator;

import static io.ReadLines.*;
import static io.Println.*;
//import static fun.Map.*;

public class Interact extends Fun<Fun<? super Iterator<String>,? extends Iterator<?>>, Unit> {

        public Unit apply (Fun<? super Iterator<String>,? extends Iterator<?>> f) {
                interact(f);
                return Unit.UNIT;
        }

        public static void interact(Fun<? super Iterator<String>,? extends Iterator<?>> f) {
               new Map<Object,Unit>().apply(println(System.out),f.apply(readLines(System.in)));
//                map(println(System.out),f.apply(readLines(System.in)));
        }

}
