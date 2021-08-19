package com.csy.design.bridge;

public class ConcreteRemoteControl2 extends RemoteControl {
    public ConcreteRemoteControl2(BaseTv tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("ConcreteRemoteControl2.on()");
        baseTv.on();
    }

    @Override
    public void off() {
        System.out.println("ConcreteRemoteControl2.off()");
        baseTv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("ConcreteRemoteControl2.tuneChannel()");
        baseTv.tuneChannel();
    }
}