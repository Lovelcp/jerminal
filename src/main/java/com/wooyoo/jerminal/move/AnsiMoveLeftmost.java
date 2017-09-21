package com.wooyoo.jerminal.move;

public class AnsiMoveLeftmost extends AnsiMoveLeft {
    private final static int MAX_LEFT_MOVE_NUMS = 2000;

    public AnsiMoveLeftmost() {
        this(MAX_LEFT_MOVE_NUMS);
    }

    public AnsiMoveLeftmost(int code) {
        super(code);
    }
}
