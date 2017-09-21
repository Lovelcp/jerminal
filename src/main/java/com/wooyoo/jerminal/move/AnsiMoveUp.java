package com.wooyoo.jerminal.move;

import com.wooyoo.jerminal.AnsiConstants;

public class AnsiMoveUp extends AnsiMovement {
    public AnsiMoveUp(int code) {
        super(code, AnsiConstants.ANSI_UP);
    }
}
