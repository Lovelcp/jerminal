package com.wooyoo.jerminal.move;

import com.wooyoo.jerminal.AnsiConstants;

public class AnsiRightMove extends AnsiMovement {
    public AnsiRightMove(int code) {
        super(code, AnsiConstants.ANSI_RIGHT_END);
    }
}
