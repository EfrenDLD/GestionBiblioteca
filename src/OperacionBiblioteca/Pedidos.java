package OperacionBiblioteca;

public class Pedidos {
    private String nombre;
    private int cantidad;
    private int dias1;

    public Pedidos(String nombre, int cantidad, int dias1) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.dias1 = dias1;
    }
    public  Pedidos(){

    }
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getDias1() {
        return dias1;
    }

    @Override
    public String toString() {
        return "Nombre : " + nombre + "Cantidad : " + cantidad + "Dias : " + dias1;
    }
}
