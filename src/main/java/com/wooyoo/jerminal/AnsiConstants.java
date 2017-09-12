package com.wooyoo.jerminal;

public class AnsiConstants {

    public static final String ANSI_START = "\u001b[";

    /**
     * Foreground Colors Codes
     */
    public static final String FG_BLACK_CODE = "30";
    public static final String FG_RED_CODE = "31";
    public static final String FG_GREEN_CODE = "32";
    public static final String FG_YELLOW_CODE = "33";
    public static final String FG_BLUE_CODE = "34";
    public static final String FG_MAGENTA_CODE = "35";
    public static final String FG_CYAN_CODE = "36";
    public static final String FG_WHITE_CODE = "37";
    public static final String FG_DEFAULT_CODE = "39";

    /**
     * Foreground Bright Colors Codes
     */
    public static final String FG_BRIGHT_BLACK_CODE = "90";
    public static final String FG_BRIGHT_RED_CODE = "91";
    public static final String FG_BRIGHT_GREEN_CODE = "92";
    public static final String FG_BRIGHT_YELLOW_CODE = "93";
    public static final String FG_BRIGHT_BLUE_CODE = "94";
    public static final String FG_BRIGHT_MAGENTA_CODE = "95";
    public static final String FG_BRIGHT_CYAN_CODE = "96";
    public static final String FG_BRIGHT_WHITE_CODE = "97";

    /**
     * Background Colors Codes
     */
    public static final String BG_BLACK_CODE = "40";
    public static final String BG_RED_CODE = "41";
    public static final String BG_GREEN_CODE = "42";
    public static final String BG_YELLOW_CODE = "43";
    public static final String BG_BLUE_CODE = "44";
    public static final String BG_MAGENTA_CODE = "45";
    public static final String BG_CYAN_CODE = "46";
    public static final String BG_WHITE_CODE = "47";
    public static final String BG_DEFAULT_CODE = "49";

    /**
     * Background Bright Colors Codes
     */
    public static final String BG_BRIGHT_BLACK_CODE = "100";
    public static final String BG_BRIGHT_RED_CODE = "101";
    public static final String BG_BRIGHT_GREEN_CODE = "102";
    public static final String BG_BRIGHT_YELLOW_CODE = "103";
    public static final String BG_BRIGHT_BLUE_CODE = "104";
    public static final String BG_BRIGHT_MAGENTA_CODE = "105";
    public static final String BG_BRIGHT_CYAN_CODE = "106";
    public static final String BG_BRIGHT_WHITE_CODE = "107";

    /**
     * Other Color Constants
     */
    public static final String ANSI_COLOR_END = "m";
    public static final String RESET_CODE = "0";

    /**
     * Decoration Codes
     */
    public static final String ANSI_BOLD_CODE = "1";
    public static final String ANSI_UNDERLINE_CODE = "4";
    public static final String ANSI_REVERSED_CODE = "7";
    public static final String ANSI_DECORATION_END = "m";
}
