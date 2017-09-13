package com.wooyoo.jerminal;

public class Test {
    public static void main(String[] args) {
        //        System.out.println("\u001b[81mHelloWorld");
        //        System.out.println("哈哈哈哈");

        Jerminal.printlnInRed("aaa");

        System.out.println("\u001b[32;1m\u001b[33;1mHH");

        Jerminal.println(AnsiOutputBuilder.newBuilder()
                                          .bold()
                                          .red()
                                          .underline()
                                          .content("Hello World")
                                          .build());
    }
}
