package com.wooyoo.jerminal;

public class AnsiColorOutput {

    public static String encode(AnsiColor ansiColor, String... inputs) {
        StringBuilder sb = new StringBuilder();
        setColor(sb, ansiColor);
        for (String input : inputs) {
            sb.append(input);
        }
        reset(sb);
        return sb.toString();
    }

    private static void setColor(StringBuilder sb, AnsiColor ansiColor) {
        sb.append(AnsiConstants.ANSI_START);
        sb.append(ansiColor.getCode());
        sb.append(AnsiConstants.ANSI_COLOR_END);
    }

    private static void reset(StringBuilder sb) {
        sb.append(AnsiConstants.ANSI_START);
        sb.append(AnsiConstants.RESET_CODE);
        sb.append(AnsiConstants.ANSI_COLOR_END);
    }
}
