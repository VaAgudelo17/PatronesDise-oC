package com.refactorizando.statepattern.example;




public class BuyingState extends State{
    
    public BuyingState(User user) {
        super(user);
        user.setBuying(true);
    }

    @Override
    public String onActive() {
        user.changeState(new ActiveState(user));
        return "Active...";
    }

    @Override
    public String onDisable() {
        user.changeState(new DisableState(user));
        return "Stop buying";
    }

    @Override
    public String onLock() {
        user.changeState(new LockState(user));
        return "Stop buying";
    }

    @Override
    public String onBuy() {
        return "Already buying";
    }

    
}
