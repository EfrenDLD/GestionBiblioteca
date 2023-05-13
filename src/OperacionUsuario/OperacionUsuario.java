package OperacionUsuario;

import java.util.Scanner;

public class OperacionUsuario {
    Scanner scanner = new Scanner(System.in);
    PrestamosLibros prestamosLibros = new PrestamosLibros();
;   public void Usuarios(){
    int escoger = 0;
    while (escoger != 4)
        System.out.println("Menu de Operaciones/Usuario");
        System.out.println("1.- Solicitar Prestamo");
        System.out.println("2.- Devolver Libro");
        System.out.println("3.- Pagar Adeudo por exeder dias");
        System.out.println("4.- Regresar al Menu Princiapl");
        System.out.printf("Seleccione una opcion :");
        escoger = scanner.nextInt();
        while(escoger != 4){
            switch (escoger) {
                case 1:
                    prestamosLibros.registrarLibro();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }
}

