package org.example.nomina;

public abstract class Empleado {
    protected String nombre, direccion, ciudad, estado, telefono;
    protected int numTrabajador;

    public Empleado(){

    }

    public Empleado(String nombre, int numTrabajador,
                    String direccion, String ciudad,
                    String estado, String telefono){
        this.nombre = nombre;
        this.numTrabajador = numTrabajador;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.telefono = telefono;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getNumTrabajador(){
        return numTrabajador;
    }

    public void setNumTrabajador(int numTrabajador){
        this.numTrabajador = numTrabajador;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getCiudad(){
        return ciudad;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String toString(){
        return "Nombre: " + nombre + "\nNumero de Trabajador: "
                + numTrabajador + "\nDireccion: " + direccion
                + "\nCiudad: " + ciudad + "\nEstado: " + estado
                + "\nTelefono: " + telefono;
    }

    public abstract void imprimir();

    public abstract Double pago();
}
