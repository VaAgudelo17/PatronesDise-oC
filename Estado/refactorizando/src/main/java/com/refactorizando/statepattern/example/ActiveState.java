package com.refactorizando.statepattern.example;




public class ActiveState extends State {
    public ActiveState(User user) {
        super(user);
    }

    @Override
    public String onActive() {
        return "Already active";
    }

    @Override
    public String onDisable() {
        user.changeState(new DisableState(user));
        return "Disabled...";
    }

    @Override
    public String onLock() {
        user.changeState(new LockState(user));
        return "Locked...";
    }

    @Override
    public String onBuy() {
        String action = user.startBuy();
        user.changeState(new BuyingState(user));
        return action;
    }

    
}
