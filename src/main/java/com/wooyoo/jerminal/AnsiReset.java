package com.wooyoo.jerminal;

public class AnsiReset implements AnsiCode {
    public String getCode() {
        return AnsiConstants.RESET_CODE;
    }
}
