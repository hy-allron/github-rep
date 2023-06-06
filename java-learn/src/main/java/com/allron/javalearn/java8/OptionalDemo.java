package com.allron.javalearn.java8;

import java.util.Optional;

/**
 * TODO
 *
 * @author allron
 * @date 2022/6/13 16:29
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("bam");

        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse("fallback");    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
    }
}
