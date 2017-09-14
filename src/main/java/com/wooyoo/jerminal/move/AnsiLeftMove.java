package com.wooyoo.jerminal.move;

import com.wooyoo.jerminal.AnsiConstants;

public class AnsiLeftMove extends AnsiMovement {
    public AnsiLeftMove(int code) {
        super(code, AnsiConstants.ANSI_LEFT_END);
    }
}
