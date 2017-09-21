package com.wooyoo.jerminal.move;

import com.wooyoo.jerminal.AnsiConstants;

public class AnsiMoveDown extends AnsiMovement {
    public AnsiMoveDown(int code) {
        super(code, AnsiConstants.ANSI_DOWN);
    }
}
