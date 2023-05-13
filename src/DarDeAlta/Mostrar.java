package DarDeAlta;

import java.util.ArrayList;

public class Mostrar {
    public void imprimirAlumno(ArrayList<Alumnos> alumnos) {
        System.out.println("\nLista de Alumnos Registrados:");
        for (Alumnos alumno : alumnos) {
            System.out.println(alumno.toString());
        }
    }
    public void imprimirMaestro(ArrayList<Profesor> profesores) {
        System.out.println("\nLista de Profesores Registrados:");
        for (Profesor profesor : profesores) {
            System.out.println(profesor.toString());
        }
    }
}



