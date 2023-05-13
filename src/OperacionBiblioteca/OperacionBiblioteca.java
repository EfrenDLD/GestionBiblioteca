package OperacionBiblioteca;

import java.util.Scanner;

public class OperacionBiblioteca {
    Scanner scanner =  new Scanner(System.in);
    public void Operacion(){
        int multa =10;
        int dias = 3;
        System.out.printf("Menu de Operaciones");
        System.out.println("1.- Prestar libro");
        System.out.println("2.- Cobrar Multa");
        System.out.println("3.- Registrar Nuevo Libro");
        System.out.println("4.- Regresar al Menu Princiapl");
        System.out.printf("Seleccione una opcion :");
        int escoger = scanner.nextInt();
        while(escoger != 4){
            switch (escoger) {
                case 1:

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
