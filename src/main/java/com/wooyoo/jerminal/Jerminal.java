package com.wooyoo.jerminal;

import java.io.PrintStream;

public class Jerminal {
    private final static PrintStream out = System.out;

    public static void println(AnsiOutput output) {
        out.println(output);
    }

    public static void printlnInRed(String str) {
        out.println(AnsiCodec.encode(AnsiForegroundColors.RED, str));
    }

    public static void printlnInGreen(String str) {
        out.println(AnsiCodec.encode(AnsiForegroundColors.GREEN, str));
    }

    public static void printlnInYellow(String str) {
        out.println(AnsiCodec.encode(AnsiForegroundColors.YELLOW, str));
    }

    public static void printlnInBlue(String str) {
        out.println(AnsiCodec.encode(AnsiForegroundColors.BLUE, str));
    }

    public static void printlnInMagenta(String str) {
        out.println(AnsiCodec.encode(AnsiForegroundColors.MAGENTA, str));
    }

    public static void printlnInCyan(String str) {
        out.println(AnsiCodec.encode(AnsiForegroundColors.CYAN, str));
    }

    public static void printlnInWhite(String str) {
        out.println(AnsiCodec.encode(AnsiForegroundColors.WHITE, str));
    }
}
