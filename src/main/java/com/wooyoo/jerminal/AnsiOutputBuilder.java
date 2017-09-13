package com.wooyoo.jerminal;

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

}
