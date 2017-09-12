package com.wooyoo.jerminal;

public enum AnsiDecorations implements AnsiDecoration {

    // @formatter:off
    BOLD(AnsiConstants.ANSI_BOLD_CODE),
    UNDERLINE(AnsiConstants.ANSI_UNDERLINE_CODE),
    REVERSED(AnsiConstants.ANSI_REVERSED_CODE);
    // @formatter:on

    private String code;

    AnsiDecorations(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
