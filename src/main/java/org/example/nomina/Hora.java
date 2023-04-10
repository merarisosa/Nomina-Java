package org.example.nomina;

public class Hora extends Empleado{

    private double sueldoHora;
    private int horasTrabajadas;

    public Hora(){

    }

    public Hora(double sueldoHora, int horasTrabajadas){
        this.sueldoHora = sueldoHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public Hora(String nombre, int numTrabajador,
                String direccion, String ciudad,
                String estado, String telefono,
                double sueldoHora, int horasTrabajadas) {
        super(nombre, numTrabajador, direccion, ciudad,
                estado, telefono);
        this.sueldoHora = sueldoHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldHora(){
        return sueldoHora;
    }

    public void setSueldoHora(double sueldoHora){
        this.sueldoHora = sueldoHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String toString(){
        return "Empleado por hora:\n " + super.toString()
                + "\nPago: $" + this.pago();
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
    }

    @Override
    public Double pago() {
        return this.getSueldHora() * this.getHorasTrabajadas();
    }
}
