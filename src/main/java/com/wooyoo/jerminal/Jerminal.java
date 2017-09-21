package com.wooyoo.jerminal;

import com.wooyoo.jerminal.color.AnsiForegroundColors;
import com.wooyoo.jerminal.move.AnsiMoveLeft;
import com.wooyoo.jerminal.move.AnsiMoveLeftmost;
import com.wooyoo.jerminal.move.AnsiMoveRight;

import java.io.PrintStream;

public class Jerminal {
    private final static PrintStream out = System.out;

    /**
     * 向左移动
     *
     * @param num
     */
    public static void moveLeft(int num) {
        out.print(AnsiCodec.encode(new AnsiMoveLeft(num)));
    }

    /**
     * 向右移动
     *
     * @param num
     */
    public static void moveRight(int num) {
        out.print(AnsiCodec.encode(new AnsiMoveRight(num)));
    }

    /**
     * 移动到最左侧
     */
    public static void moveLeftmost() {
        out.print(AnsiCodec.encode(new AnsiMoveLeftmost()));
    }

    public static void println(AnsiOutput output) {
        out.println(output);
    }

    public static void print(AnsiOutput output) {
        out.print(output);
    }

    public static void print(String output) {
        out.print(output);
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
