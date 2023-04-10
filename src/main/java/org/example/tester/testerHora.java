package org.example.tester;

import org.example.nomina.Hora;
public class testerHora {
    public static void main(String[] args) {
        Hora h1 = new Hora("Juan Ferrer",
                23456,
                "Calle 8",
                "Veracruz",
                "Veracruz",
                "2345657687",
                22.2,
                3);
        h1.imprimir();
    }
}
