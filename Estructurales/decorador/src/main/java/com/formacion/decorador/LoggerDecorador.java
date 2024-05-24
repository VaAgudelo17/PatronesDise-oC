package com.formacion.decorador;

import java.util.List;

public class LoggerDecorador implements BaseDeDatos {
    private final BaseDeDatos baseDeDatos;
    private final Logger logger;

    public LoggerDecorador(BaseDeDatos baseDeDatos, Logger logger) {
        this.baseDeDatos = baseDeDatos;
        this.logger = logger;
    }

    @Override
    public void inserta(String registro) {
        logger.add("inserta " + registro);
        baseDeDatos.inserta(registro);
    }

    @Override
    public List<String> registros() {
        logger.add("lectura");
        return baseDeDatos.registros();

    }
    
}
