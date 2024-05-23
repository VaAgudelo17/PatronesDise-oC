package com.mediator;

public class Radio {
    private Mediator mediator;
    private boolean encendida = false;

    public Radio() {
        
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciende() {
        encendida = true;
        mediator.encenderRadio();
        System.out.println("Radio encendida");
    }

    public void apaga() {
        encendida = false;
        System.out.println("Radio apagada");
    }

    public boolean encendida() {
        return encendida;
    }
    
}
