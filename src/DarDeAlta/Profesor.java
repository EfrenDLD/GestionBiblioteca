package DarDeAlta;

public class Profesor {
    private String nombre;
    private String apellido;
    private int edad;
    private String instituto;
    private String area;

    public Profesor(String nombre, String apellido, int edad, String instituto, String area) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.instituto = instituto;
        this.area = area;
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

    public String getInstituto() {
        return instituto;
    }

    public String getArea() {
        return area;
    }
    @Override
    public String toString() {
        return "Nombre : " + nombre + "Apellido: " + apellido + "Edad: " + edad + "Instituto :" +instituto + "Area :"+ area;
    }
}
