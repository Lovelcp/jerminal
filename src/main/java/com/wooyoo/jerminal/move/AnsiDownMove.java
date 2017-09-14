package com.wooyoo.jerminal.move;

import com.wooyoo.jerminal.AnsiConstants;

public class AnsiDownMove extends AnsiMovement {
    public AnsiDownMove(int code) {
        super(code, AnsiConstants.ANSI_DOWN_END);
    }
}
