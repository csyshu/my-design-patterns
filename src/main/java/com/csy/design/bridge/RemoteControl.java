package com.csy.design.bridge;

public abstract class RemoteControl {
    protected BaseTv baseTv;

    public RemoteControl(BaseTv baseTv) {
        this.baseTv = baseTv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}