package DarDeAlta;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistrarProfesor {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Profesor> listaProfesores = new ArrayList<>();

    public void Maestros() {
        System.out.println("\nRegistro de profesor");
        System.out.println("Ingrese el nombre del profesor:");
        String nombre = scanner.next();
        System.out.println("Ingrese el apellido del profesor:");
        String apellido = scanner.next();
        System.out.println("Ingrese la edad del profesor:");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el instituto del profesor:");
        String instituto = scanner.next();
        System.out.println("Ingrese el área de adscripción del profesor:");
        String area = scanner.next();
        Profesor profesor = new Profesor(nombre, apellido, edad, instituto, area);
        listaProfesores.add(profesor);
        System.out.println("Se ha registrado el alumno !!");
    }

    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaAlumnos(ArrayList<Profesor> profesores) {
        this.listaProfesores = listaProfesores;
    }
}
