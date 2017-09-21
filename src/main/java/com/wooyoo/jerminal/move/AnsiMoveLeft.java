package com.wooyoo.jerminal.move;

import com.wooyoo.jerminal.AnsiConstants;

public class AnsiMoveLeft extends AnsiMovement {
    public AnsiMoveLeft(int code) {
        super(code, AnsiConstants.ANSI_LEFT);
    }
}
