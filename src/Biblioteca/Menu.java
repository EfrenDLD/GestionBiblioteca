package Biblioteca;

import DarDeAlta.MenuDeAlta;
import OperacionBiblioteca.OperacionBiblioteca;
import OperacionUsuario.OperacionUsuario;

import java.util.Scanner;

public class Menu {
    public Menu() {
    }
    Scanner scanner = new Scanner(System.in);
    MenuDeAlta menuDeAlta = new MenuDeAlta();
    OperacionBiblioteca operacionBiblioteca = new OperacionBiblioteca();
    OperacionUsuario operacionUsuario = new OperacionUsuario();

    public void MenuPrincipal(){
    int opcion = 0;
    while (opcion != 4) {
        System.out.println("\n - - Menu Biblioteca - - ");
        System.out.println("1.- Dar de alta");
        System.out.println("2.- Operacion de Usuario ");
        System.out.println("3.- Operacion de Biblioteca");
        System.out.println("4.- Salir del menu");
        System.out.println("Ingrese una opcion :");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                menuDeAlta.DeAlta();
                break;
            case 2:
                operacionUsuario.Usuarios();
                break;
            case 3:
                operacionBiblioteca.Operacion();
                break;
            case 4:
                System.out.println("Gracias por su visita");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
            }
        }
    }
}
