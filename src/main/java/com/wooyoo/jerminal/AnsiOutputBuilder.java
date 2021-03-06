package com.wooyoo.jerminal;

import com.wooyoo.jerminal.color.AnsiBackgroundColors;
import com.wooyoo.jerminal.color.AnsiForegroundColors;
import com.wooyoo.jerminal.decoration.AnsiDecorations;
import com.wooyoo.jerminal.move.AnsiMoveDown;
import com.wooyoo.jerminal.move.AnsiMoveLeft;
import com.wooyoo.jerminal.move.AnsiMoveLeftmost;
import com.wooyoo.jerminal.move.AnsiMoveRight;
import com.wooyoo.jerminal.move.AnsiMoveUp;

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
        ansiOutput.setHorizontalMove(new AnsiMoveLeft(num));
        return this;
    }

    public AnsiOutputBuilder right(int num) {
        ansiOutput.setHorizontalMove(new AnsiMoveRight(num));
        return this;
    }

    public AnsiOutputBuilder up(int num) {
        ansiOutput.setVerticalMove(new AnsiMoveUp(num));
        return this;
    }

    public AnsiOutputBuilder down(int num) {
        ansiOutput.setVerticalMove(new AnsiMoveDown(num));
        return this;
    }

    public AnsiOutputBuilder leftmost() {
        ansiOutput.setHorizontalMove(new AnsiMoveLeftmost());
        return this;
    }
}
