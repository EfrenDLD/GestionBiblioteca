package DarDeAlta;

import java.util.Scanner;

public class MenuDeAlta {
    public void DeAlta() {
        Scanner scanner = new Scanner(System.in);
        RegistrarAlumno registrarAlumno = new RegistrarAlumno();
        RegistrarProfesor registrarProfesor = new RegistrarProfesor();
        Mostrar mostrar = new Mostrar();

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("Menu Dar de alta");
            System.out.println("1.- Registrar Alumnos");
            System.out.println("2.- Registrar Profesor");
            System.out.println("3.- Mostrar Registro");
            System.out.println("4.- Regresar al menu anterior");
            System.out.println("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    registrarAlumno.Alumnos();
                    break;
                case 2:
                    registrarProfesor.Maestros();
                    break;
                case 3:
                    System.out.println("\negistro de Alumnos :");
                    mostrar.imprimirAlumno(registrarAlumno.getListaAlumnos());
                    System.out.println("\nRegistro de Profesores :");
                    mostrar.imprimirMaestro(registrarProfesor.getListaProfesores());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
