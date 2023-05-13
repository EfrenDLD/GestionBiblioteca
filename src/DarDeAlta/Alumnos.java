package DarDeAlta;

public class Alumnos {
    private String nombre;
    private String apellido;
    private int edad;
    private String semestre;
    private String matricula;
    private String carrera;

    public Alumnos(String nombre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.semestre = semestre;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public Alumnos() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return "Nombre : " + nombre + "Apellido: " + apellido + "Edad: " + edad + " Semestre: " + semestre + "Matricula : "
                + matricula + "Carrera :" + carrera;
    }
}