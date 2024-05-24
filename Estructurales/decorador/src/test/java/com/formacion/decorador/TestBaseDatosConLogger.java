package com.formacion.decorador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBaseDatosConLogger {
    private BaseDeDatos bbdd;
    private Logger logger;

    @BeforeEach
    public void init() {
        BaseDeDatos sinLogger = new BaseDeDatosMemoria();
        logger = new Logger();
        bbdd = new LoggerDecorador(sinLogger, logger); 
    }

    @Test
    public void test_inserta() {
        bbdd.inserta("uno");
        assertEquals(1, bbdd.registros().size());
        assertEquals("inserta uno", logger.obtener().get(0));
    }

    @Test
    public void test_lectura() {
        bbdd.inserta("uno");
        bbdd.registros();
        assertEquals("lectura", logger.obtener().get(1));
    }
    
}
