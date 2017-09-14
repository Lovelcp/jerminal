package com.wooyoo.jerminal.move;

public class AnsiLeftmostMove extends AnsiLeftMove {
    private final static int MAX_LEFT_MOVE_NUMS = 2000;

    public AnsiLeftmostMove() {
        this(MAX_LEFT_MOVE_NUMS);
    }

    public AnsiLeftmostMove(int code) {
        super(code);
    }
}
