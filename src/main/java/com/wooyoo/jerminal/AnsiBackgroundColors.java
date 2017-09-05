package com.wooyoo.jerminal;

public enum AnsiBackgroundColors {

    /*
     * @formatter:off
     */
    BLACK(AnsiConstants.BG_BLACK_CODE),
    RED(AnsiConstants.BG_RED_CODE),
    GREEN(AnsiConstants.BG_GREEN_CODE),
    YELLOW(AnsiConstants.BG_YELLOW_CODE),
    BLUE(AnsiConstants.BG_BLUE_CODE),
    MAGENTA(AnsiConstants.BG_MAGENTA_CODE),
    CYAN(AnsiConstants.BG_CYAN_CODE),
    WHITE(AnsiConstants.BG_WHITE_CODE),
    DEFAULT(AnsiConstants.BG_DEFAULT_CODE),

    BRIGHT_BLACK(AnsiConstants.BG_BRIGHT_BLACK_CODE),
    BRIGHT_RED(AnsiConstants.BG_BRIGHT_RED_CODE),
    BRIGHT_GREEN(AnsiConstants.BG_BRIGHT_GREEN_CODE),
    BRIGHT_YELLOW(AnsiConstants.BG_BRIGHT_YELLOW_CODE),
    BRIGHT_BLUE(AnsiConstants.BG_BRIGHT_BLUE_CODE),
    BRIGHT_MAGENTA(AnsiConstants.BG_BRIGHT_MAGENTA_CODE),
    BRIGHT_CYAN(AnsiConstants.BG_BRIGHT_CYAN_CODE),
    BRIGHT_WHITE(AnsiConstants.BG_BRIGHT_WHITE_CODE);
    /*
     * @formatter:on
     */

    private final String code;

    AnsiBackgroundColors(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
