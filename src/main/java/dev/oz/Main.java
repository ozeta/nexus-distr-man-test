package dev.oz;

import org.jooq.lambda.Seq;

public class Main {
    public static void main(String[] args) {
        System.out.println("ciao");
        // (tuple("a", 0), tuple("b", 1), tuple("c", 2))
        Seq.of("a", "b", "c")
                .zipWithIndex()
                .forEach(t -> System.out.println(t.v1 + " " + t.v2));
    }
}
