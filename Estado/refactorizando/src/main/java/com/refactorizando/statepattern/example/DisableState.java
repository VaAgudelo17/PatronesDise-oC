package com.refactorizando.statepattern.example;




public class DisableState extends State {
    public DisableState(User user) {
        super(user);
        user.setBuying(false);
        user.setEnable(false);
    }

    @Override
    public String onActive() {
        user.setEnable(true);
        user.changeState(new ActiveState(user));
        return "Activated...";
    }

    @Override
    public String onLock() {
        user.changeState(new LockState(user));
        return "Disable locked...";
    }

    @Override
    public String onDisable() {
        return "Already disabled...";
    }

    @Override
    public String onBuy() {
        return "Cannot buy, card is disabled.";
    }
    
}
