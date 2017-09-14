package com.wooyoo.jerminal;

import com.wooyoo.jerminal.move.AnsiDownMove;
import com.wooyoo.jerminal.move.AnsiLeftMove;
import com.wooyoo.jerminal.move.AnsiLeftmostMove;
import com.wooyoo.jerminal.move.AnsiRightMove;
import com.wooyoo.jerminal.move.AnsiUpMove;

public class AnsiOutputBuilder {
    private AnsiOutput ansiOutput;

    private AnsiOutputBuilder() {
        this.ansiOutput = new AnsiOutput();
    }

    public static AnsiOutputBuilder newBuilder() {
        return new AnsiOutputBuilder();
    }

    public AnsiOutput build() {
        return this.ansiOutput;
    }

    public AnsiOutputBuilder red() {
        ansiOutput.setForeground(AnsiForegroundColors.RED);
        return this;
    }

    public AnsiOutputBuilder redBackground() {
        ansiOutput.setBackground(AnsiBackgroundColors.RED);
        return this;
    }

    /**
     * 设置字符串
     *
     * @param content
     * @return
     */
    public AnsiOutputBuilder content(String content) {
        ansiOutput.setContent(content);
        return this;
    }

    /**
     * 设置粗体
     *
     * @return
     */
    public AnsiOutputBuilder bold() {
        ansiOutput.setDecoration(AnsiDecorations.BOLD);
        return this;
    }

    /**
     * 设置下划线
     *
     * @return
     */
    public AnsiOutputBuilder underline() {
        ansiOutput.setDecoration(AnsiDecorations.UNDERLINE);
        return this;
    }

    public AnsiOutputBuilder left(int num) {
        ansiOutput.setHorizontalMove(new AnsiLeftMove(num));
        return this;
    }

    public AnsiOutputBuilder right(int num) {
        ansiOutput.setHorizontalMove(new AnsiRightMove(num));
        return this;
    }

    public AnsiOutputBuilder up(int num) {
        ansiOutput.setVerticalMove(new AnsiUpMove(num));
        return this;
    }

    public AnsiOutputBuilder down(int num) {
        ansiOutput.setVerticalMove(new AnsiDownMove(num));
        return this;
    }

    public AnsiOutputBuilder leftmost() {
        ansiOutput.setHorizontalMove(new AnsiLeftmostMove());
        return this;
    }
}
