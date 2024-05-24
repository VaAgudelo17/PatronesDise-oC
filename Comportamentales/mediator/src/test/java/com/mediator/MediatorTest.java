package com.mediator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


public class MediatorTest {
    private Coche coche;
    private Radio radio;
    private Telefono telefono;
    private CocheMediator mediator;

    @BeforeEach
    public void init() {
<<<<<<< HEAD
      
=======

>>>>>>> c8b96bca8b5f766f200fd7041e0f7600b01a38ab
        coche = new Coche();
        radio = new Radio();
        telefono = new Telefono();

<<<<<<< HEAD
       
        mediator = new CocheMediator(coche, radio, telefono);

        
=======
    
        mediator = new CocheMediator(coche, radio, telefono);

       
>>>>>>> c8b96bca8b5f766f200fd7041e0f7600b01a38ab
        coche.setMediator(mediator);
        radio.setMediator(mediator);
        telefono.setMediator(mediator);
    }

    @Test
    public void testEncenderCoche() {
        assertNotNull(coche);
        coche.enciende();
        assertTrue(radio.encendida());
        assertFalse(telefono.musicaEncendida());
    }

    @Test
    public void testApagarCoche() {
        assertNotNull(coche);
        coche.apagar();
        assertFalse(radio.encendida());
    }

    @Test
    public void testSonarTelefono() {
        assertNotNull(telefono);
        telefono.sonar();
        assertFalse(radio.encendida());
    }

    @Test
    public void testEncenderRadio() {
        assertNotNull(radio);
        radio.enciende();
        assertTrue(radio.encendida());
        assertFalse(telefono.musicaEncendida());
    }
    
}
