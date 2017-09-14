package com.wooyoo.jerminal;

import com.wooyoo.jerminal.move.AnsiMove;

import java.util.List;

public class AnsiCodec {

    private static final AnsiCode reset = new AnsiReset();

    public static String encode(AnsiMove ansiMove) {
        StringBuilder sb = new StringBuilder();
        if (ansiMove != null) {
            setMovement(sb, ansiMove);
        }
        return sb.toString();
    }

    public static String encode(AnsiCode ansiCode, String... inputs) {
        StringBuilder sb = new StringBuilder();
        if (ansiCode != null) {
            parseCode(sb, ansiCode);
        }
        for (String input : inputs) {
            if (input != null) {
                sb.append(input);
            }
        }
        reset(sb);
        return sb.toString();
    }

    public static String encode(List<AnsiCode> ansiCodes, String... inputs) {
        StringBuilder sb = new StringBuilder();
        for (AnsiCode code : ansiCodes) {
            if (code != null) {
                parseCode(sb, code);
            }
        }
        for (String input : inputs) {
            if (input != null) {
                sb.append(input);
            }
        }
        reset(sb);
        return sb.toString();
    }

    private static void parseCode(StringBuilder sb, AnsiCode ansiCode) {
        if (ansiCode == null) {
            return;
        }
        if (ansiCode instanceof AnsiColor) {
            setColor(sb, (AnsiColor) ansiCode);
        }
        else if (ansiCode instanceof AnsiDecoration) {
            setDecoration(sb, (AnsiDecoration) ansiCode);
        }
        else if (ansiCode instanceof AnsiMove) {
            setMovement(sb, (AnsiMove) ansiCode);
        }
    }

    private static void setDecoration(StringBuilder sb, AnsiDecoration ansiDecoration) {
        sb.append(AnsiConstants.ANSI_START);
        sb.append(ansiDecoration.getCode());
        sb.append(AnsiConstants.ANSI_DECORATION_END);
    }

    private static void setColor(StringBuilder sb, AnsiColor ansiColor) {
        sb.append(AnsiConstants.ANSI_START);
        sb.append(ansiColor.getCode());
        sb.append(AnsiConstants.ANSI_COLOR_END);
    }

    private static void reset(StringBuilder sb) {
        sb.append(AnsiConstants.ANSI_START);
        sb.append(reset.getCode());
        sb.append(AnsiConstants.ANSI_COLOR_END);
    }

    private static void setMovement(StringBuilder sb, AnsiMove ansiMove) {
        sb.append(AnsiConstants.ANSI_START);
        sb.append(ansiMove.getCode());
        sb.append(ansiMove.getDirection());
    }
}
