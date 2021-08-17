package com.csy.design.command;

/**
 * 遥控器
 */
public class Invoker {
    private final Command[] onCommands;
    private final Command[] offCommands;
    private static final int SLOT_NUM = 7;

    public Invoker() {
        this.onCommands = new Command[SLOT_NUM];
        this.offCommands = new Command[SLOT_NUM];
    }

    public void setOnCommand(Command command, int slot) {
        onCommands[slot] = command;
    }

    public void setOffCommand(Command command, int slot) {
        offCommands[slot] = command;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}