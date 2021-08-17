package com.csy.design.mediator;

public class ConcreteMediator implements Mediator {
    private final Alarm alarm;
    private final CoffeePot coffeePot;
    private final Calender calender;
    private final Sprinkler sprinkler;

    public ConcreteMediator(Alarm alarm, CoffeePot coffeePot, Calender calender, Sprinkler sprinkler) {
        this.alarm = alarm;
        this.coffeePot = coffeePot;
        this.calender = calender;
        this.sprinkler = sprinkler;
    }

    @Override
    public void doEvent(String eventType) {
        switch (eventType) {
            case "alarm":
                doAlarmEvent();
                break;
            case "coffeePot":
                doCoffeePotEvent();
                break;
            case "calender":
                doCalenderEvent();
                break;
            default:
                doSprinklerEvent();
        }
    }

    public void doAlarmEvent() {
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        calender.doCalender();
        sprinkler.doSprinkler();
    }

    public void doCoffeePotEvent() {
        coffeePot.doCoffeePot();
        alarm.doAlarm();
        calender.doCalender();
        sprinkler.doSprinkler();
    }

    public void doCalenderEvent() {
        calender.doCalender();
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        sprinkler.doSprinkler();
    }

    public void doSprinklerEvent() {
        sprinkler.doSprinkler();
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        calender.doCalender();
    }
}