package com.wooyoo.jerminal.move;

import com.wooyoo.jerminal.AnsiConstants;

public class AnsiUpMove extends AnsiMovement {
    public AnsiUpMove(int code) {
        super(code, AnsiConstants.ANSI_UP_END);
    }
}
