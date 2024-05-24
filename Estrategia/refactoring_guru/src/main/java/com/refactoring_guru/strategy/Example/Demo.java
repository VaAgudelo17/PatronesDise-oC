package com.refactoring_guru.strategy.Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import com.refactoring_guru.strategy.Example.order.Order;
import com.refactoring_guru.strategy.Example.strategies.PayByCreditCard;
import com.refactoring_guru.strategy.Example.strategies.PayByPayPal;
import com.refactoring_guru.strategy.Example.strategies.PayStrategy;

public class Demo {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("Por favor, selecciona un producto:" + "\n" +
                        "1 - Placa madre" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memoria" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Cantidad: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("¿Deseas continuar seleccionando productos? S/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("S"));

            if (strategy == null) {
                System.out.println("Por favor, selecciona un método de pago:" + "\n" +
                        "1 - PayPal" + "\n" +
                        "2 - Tarjeta de crédito");
                String paymentMethod = reader.readLine();

                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else {
                    strategy = (PayStrategy) new PayByCreditCard();
                }
            }

            order.processOrder(strategy);

            System.out.print("Pagar " + order.getTotalCost() + " unidades o continuar comprando? P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("El pago se ha realizado con exito.");
                } else {
                    System.out.println("¡FALLO! Por favor, revisa tus datos.");
                }
                order.setClosed();
            }
        }
    }
    
    
}
