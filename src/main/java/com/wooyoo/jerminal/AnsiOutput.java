package com.wooyoo.jerminal;

import java.util.Arrays;

public class AnsiOutput {
    private AnsiColor background;
    private AnsiColor foreground;
    private AnsiDecoration decoration;
    private String content;

    public AnsiOutput(String content) {
        this.content = content;
    }

    public AnsiOutput setRed() {
        this.foreground = AnsiForegroundColors.RED;
        return this;
    }

    public AnsiOutput setRedBackground() {
        this.background = AnsiBackgroundColors.RED;
        return this;
    }

    public AnsiOutput setBold() {
        this.decoration = AnsiDecorations.BOLD;
        return this;
    }

    @Override
    public String toString() {
        if (content == null) {
            content = "";
        }
        return AnsiCodec.encode(Arrays.asList(background, foreground, decoration), content);
    }
}
