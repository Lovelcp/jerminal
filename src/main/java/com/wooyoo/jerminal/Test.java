package com.wooyoo.jerminal;

public class Test {
    public static void main(String[] args) throws InterruptedException {
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

        // demo 进度条
        // 一定要注意的是，IDE下是无效果的，要在命令行下才有效果
        for (int i = 0; i <= 100; i++) {
            Jerminal.print(AnsiOutputBuilder.newBuilder()
                                            .leftmost()
                                            .content(i + "%")
                                            .build());
            Thread.sleep(1000);
        }
    }
}
