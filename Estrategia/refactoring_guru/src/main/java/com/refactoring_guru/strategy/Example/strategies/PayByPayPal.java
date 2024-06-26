package com.refactoring_guru.strategy.Example.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class PayByPayPal implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("Introduce el correo electrónico del usuario: ");
                email = READER.readLine();
                System.out.print("Introduce la contraseña: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("La verificación de datos ha sido exitosa.");
                } else {
                    System.out.println("¡Correo electrónico o contraseña incorrectos!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Pagando " + paymentAmount + " usando PayPal.");
            return true;
        } else {
            return false;
        }
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
    
        
}
