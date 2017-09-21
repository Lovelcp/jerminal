package com.wooyoo.jerminal.color;

import com.wooyoo.jerminal.AnsiConstants;
import com.wooyoo.jerminal.color.AnsiColor;

public enum AnsiForegroundColors implements AnsiColor {

    // @formatter:off
    BLACK(AnsiConstants.FG_BLACK_CODE),
    RED(AnsiConstants.FG_RED_CODE),
    GREEN(AnsiConstants.FG_GREEN_CODE),
    YELLOW(AnsiConstants.FG_YELLOW_CODE),
    BLUE(AnsiConstants.FG_BLUE_CODE),
    MAGENTA(AnsiConstants.FG_MAGENTA_CODE),
    CYAN(AnsiConstants.FG_CYAN_CODE),
    WHITE(AnsiConstants.FG_WHITE_CODE),
    DEFAULT(AnsiConstants.FG_DEFAULT_CODE),

    BRIGHT_BLACK(AnsiConstants.FG_BRIGHT_BLACK_CODE),
    BRIGHT_RED(AnsiConstants.FG_BRIGHT_RED_CODE),
    BRIGHT_GREEN(AnsiConstants.FG_BRIGHT_GREEN_CODE),
    BRIGHT_YELLOW(AnsiConstants.FG_BRIGHT_YELLOW_CODE),
    BRIGHT_BLUE(AnsiConstants.FG_BRIGHT_BLUE_CODE),
    BRIGHT_MAGENTA(AnsiConstants.FG_BRIGHT_MAGENTA_CODE),
    BRIGHT_CYAN(AnsiConstants.FG_BRIGHT_CYAN_CODE),
    BRIGHT_WHITE(AnsiConstants.FG_BRIGHT_WHITE_CODE);
    // @formatter:on

    private final String code;

    AnsiForegroundColors(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
