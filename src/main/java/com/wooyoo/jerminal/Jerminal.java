package com.wooyoo.jerminal;

import java.io.PrintStream;

public class Jerminal {
    public final static PrintStream out = System.out;

    public static void printlnInRed(String str) {
        out.println(AnsiColorOutput.encode(AnsiForegroundColors.RED, str));
    }

    public static void printlnInGreen(String str) {
        out.println(AnsiColorOutput.encode(AnsiForegroundColors.GREEN, str));
    }

    public static void printlnInYellow(String str) {
        out.println(AnsiColorOutput.encode(AnsiForegroundColors.YELLOW, str));
    }

    public static void printlnInBlue(String str) {
        out.println(AnsiColorOutput.encode(AnsiForegroundColors.BLUE, str));
    }

    public static void printlnInMagenta(String str) {
        out.println(AnsiColorOutput.encode(AnsiForegroundColors.MAGENTA, str));
    }

    public static void printlnInCyan(String str) {
        out.println(AnsiColorOutput.encode(AnsiForegroundColors.CYAN, str));
    }

    public static void printlnInWhite(String str) {
        out.println(AnsiColorOutput.encode(AnsiForegroundColors.WHITE, str));
    }
}
