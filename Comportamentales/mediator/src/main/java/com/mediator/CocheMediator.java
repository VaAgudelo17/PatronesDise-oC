package com.mediator;

public class CocheMediator implements Mediator {

    private Coche coche;
    private Radio radio;
    private Telefono telefono;

    public CocheMediator(Coche coche, Radio radio, Telefono telefono) {
        this.coche = coche;
        this.radio = radio;
        this.telefono = telefono;
    }

    @Override
    public void encenderCoche() {
        radio.enciende();
        telefono.apagaMusica();
    }

    @Override
    public void apagarCoche() {
        radio.apaga();
    }

    @Override
    public void sonarTelefono() {
        radio.apaga();
    }

    @Override
    public void encenderRadio() {
        telefono.apagaMusica();
    }
    
    
}
