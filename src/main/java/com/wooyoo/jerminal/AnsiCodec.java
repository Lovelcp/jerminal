package com.wooyoo.jerminal;

import java.util.List;

public class AnsiCodec {

    private static final AnsiCode reset = new AnsiReset();

    public static String encode(AnsiCode ansiCode, String... inputs) {
        StringBuilder sb = new StringBuilder();
        parseCode(sb, ansiCode);
        for (String input : inputs) {
            sb.append(input);
        }
        reset(sb);
        return sb.toString();
    }

    public static String encode(List<AnsiCode> ansiCodes, String... inputs) {
        StringBuilder sb = new StringBuilder();
        for (AnsiCode code : ansiCodes) {
            parseCode(sb, code);
        }
        for (String input : inputs) {
            sb.append(input);
        }
        reset(sb);
        return sb.toString();
    }

    private static void parseCode(StringBuilder sb, AnsiCode ansiCode) {
        if (ansiCode instanceof AnsiColor) {
            setColor(sb, ansiCode);
        }
        else if (ansiCode instanceof AnsiDecoration) {
            setDecoration(sb, ansiCode);
        }
    }

    private static void setDecoration(StringBuilder sb, AnsiCode ansiDecoration) {
        sb.append(AnsiConstants.ANSI_START);
        sb.append(ansiDecoration.getCode());
        sb.append(AnsiConstants.ANSI_DECORATION_END);
    }

    private static void setColor(StringBuilder sb, AnsiCode ansiColor) {
        sb.append(AnsiConstants.ANSI_START);
        sb.append(ansiColor.getCode());
        sb.append(AnsiConstants.ANSI_COLOR_END);
    }

    private static void reset(StringBuilder sb) {
        sb.append(AnsiConstants.ANSI_START);
        sb.append(reset.getCode());
        sb.append(AnsiConstants.ANSI_COLOR_END);
    }
}
