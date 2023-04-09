package org.example.tester;
import org.example.nomina.Empleado;

public class testerEmpleado {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Arnold Ferias",
        12345,
        "Calle 56",
        "Xalapa",
        "Veracruz",
        "7756435676") {

            @Override
            public void imprimir() {
                System.out.println(toString());
            }

            @Override
            public Double pago() {
                return null;
            }
        };

        emp1.imprimir();
    }
}
