package com.mediator;

public class Coche {
    private Mediator mediator;

    public Coche() {
        
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciende() {
        mediator.encenderCoche();
    }

    public void apagar() {
        mediator.apagarCoche();
    }
    
}
