package DarDeAlta;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistrarAlumno {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Alumnos> alumnos = new ArrayList<>();

    public void Alumnos() {
        System.out.println("\nRegistro de alumno");
        System.out.println("Ingrese el nombre del alumno:");
        String nombre = scanner.next();
        System.out.println("Ingrese el apellido del alumno:");
        String apellido = scanner.next();
        System.out.println("Ingrese la edad del alumno:");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el semestre del alumno:");
        String semestre = scanner.next();
        System.out.println("Ingrese la matricula del alumno:");
        String matricula = scanner.next();
        System.out.println("Ingrese la carrera del alumno:");
        String carrera = scanner.next();

        Alumnos alumnos = new Alumnos(nombre);
        this.alumnos.add(alumnos);
        System.out.println("Se ha registrado el alumno !!");
    }

    public ArrayList<Alumnos> getListaAlumnos() {
        return alumnos;
    }

    public void setListaAlumnos(ArrayList<Alumnos> alumnos) {
        this.alumnos = alumnos;
    }
}