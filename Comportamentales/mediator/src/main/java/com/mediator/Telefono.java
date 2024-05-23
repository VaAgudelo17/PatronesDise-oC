package com.mediator;

public class Telefono {
    private Mediator mediator;
    private boolean musicaOn = false;

    public Telefono() {
       
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciendeMusica() {
        musicaOn = true;
        System.out.println("Musica encendida");
    }

    public void apagaMusica() {
        musicaOn = false;
        System.out.println("Musica apagada");
    }

    public boolean musicaEncendida() {
        return musicaOn;
    }

    public void sonar() {
        mediator.sonarTelefono();
    }
    
}
