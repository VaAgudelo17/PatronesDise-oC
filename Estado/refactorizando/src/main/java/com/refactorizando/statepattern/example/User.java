package com.refactorizando.statepattern.example;

public class User {
    private State state;
    private boolean isBuying;
    private boolean isEnable;

    public User() {
        this.state = new DisableState(this); // Estado inicial
        this.isBuying = false;
        this.isEnable = false;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public String activate() {
        return state.onActive();
    }

    public String disable() {
        return state.onDisable();
    }

    public String lock() {
        return state.onLock();
    }

    public String buy() {
        return state.onBuy();
    }

    public void setBuying(boolean isBuying) {
        this.isBuying = isBuying;
    }

    public boolean isBuying() {
        return isBuying;
    }

    public void setEnable(boolean isEnable) {
        this.isEnable = isEnable;
    }

    public boolean getEnable() {
        return isEnable;
    }

    public String startBuy() {
        if (isEnable) {
            setBuying(true);
            return "Buying started...";
        }
        return "Cannot buy, card is not enabled.";
    }
    
}
