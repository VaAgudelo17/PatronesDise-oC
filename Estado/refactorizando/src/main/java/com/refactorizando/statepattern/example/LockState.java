package com.refactorizando.statepattern.example;




public class LockState extends State {
    public LockState(User user) {
        super(user);
    }

    @Override
    public String onActive() {
        return "Locked...";
    }

    @Override
    public String onDisable() {
        return "Locked...";
    }

    @Override
    public String onLock() {
        if (user.isBuying()) {
            user.changeState(new DisableState(user));
            return "Stop buying, card is locked...";
        }
        if (user.getEnable()) {
            user.changeState(new DisableState(user));
            return "Disabled...";
        }
        return "Already locked...";
    }

    @Override
    public String onBuy() {
        return "Locked...";
    }

    
}
