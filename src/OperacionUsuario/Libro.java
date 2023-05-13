package OperacionUsuario;

public class Libro {
    private int codigoISBN;
    private String titulo;
    private String autor;
    private int numEjemplares;

    public Libro(int codigoISBN, String titulo, String autor, int numEjemplares) {
        this.codigoISBN = codigoISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
    }

    public int getCodigoISBN() {
        return codigoISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }
    @Override
    public String toString() {
        return "Codigo : " + codigoISBN + "Titulo: " + titulo+ "Autor: " + autor + " Ejemplares: " + numEjemplares;
    }

}
