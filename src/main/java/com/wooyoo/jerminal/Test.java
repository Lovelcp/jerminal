package com.wooyoo.jerminal;

public class Test {
    public static void main(String[] args) {
//        System.out.println("\u001b[81mHelloWorld");
//        System.out.println("哈哈哈哈");
        StringBuilder sb = new StringBuilder();
        sb.append("\033[81m");
        sb.append("aaa;0;39m");
        System.out.println(sb);
    }
}
