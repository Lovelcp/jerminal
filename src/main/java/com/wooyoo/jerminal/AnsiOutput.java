package com.wooyoo.jerminal;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AnsiOutput {
    private AnsiColor background;
    private AnsiColor foreground;
    private Set<AnsiDecoration> decorations = new HashSet<>();
    private String content;

    public AnsiColor getBackground() {
        return background;
    }

    public AnsiOutput setBackground(AnsiColor background) {
        this.background = background;
        return this;
    }

    public AnsiColor getForeground() {
        return foreground;
    }

    public AnsiOutput setForeground(AnsiColor foreground) {
        this.foreground = foreground;
        return this;
    }

    public AnsiOutput setDecoration(AnsiDecoration decoration) {
        decorations.add(decoration);
        return this;
    }

    public String getContent() {
        return content;
    }

    public AnsiOutput setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public String toString() {
        if (content == null) {
            content = "";
        }
        List<AnsiCode> codes = new LinkedList<>();
        codes.add(foreground);
        codes.add(background);
        codes.addAll(decorations);
        return AnsiCodec.encode(codes, content);
    }
}
