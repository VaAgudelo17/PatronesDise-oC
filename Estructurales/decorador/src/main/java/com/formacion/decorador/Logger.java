package com.formacion.decorador;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List <String> log=new ArrayList<>();
    public void add(String mensaje){
        log.add(mensaje);
    }
    public List<String> obtener(){
        return log;
    }
    
}
