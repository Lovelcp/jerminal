package com.wooyoo.jerminal.move;

public abstract class AnsiMovement implements AnsiMove {
    private String code;
    private String direction;

    public AnsiMovement(int code, String direction) {
        this.code = String.valueOf(code);
        this.direction = direction;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDirection() {
        return direction;
    }
}
