package com.csy.design.bridge;

public class ConcreteRemoteControl1 extends RemoteControl {

    public ConcreteRemoteControl1(BaseTv tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("ConcreteRemoteControl1.on()");
        baseTv.on();
    }

    @Override
    public void off() {
        System.out.println("ConcreteRemoteControl1.off()");
        baseTv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("ConcreteRemoteControl1.tuneChannel()");
        baseTv.tuneChannel();
    }
}