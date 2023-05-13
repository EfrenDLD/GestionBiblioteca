package OperacionUsuario;
import DarDeAlta.Profesor;
import DarDeAlta.Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

public class PrestamosLibros {
    private ArrayList<Libro> listaLibros = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void registrarLibro() {
        System.out.println("Ingrese el código ISBN del libro:");
        int codigoISBN = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();
        System.out.println("Ingrese el número de ejemplares disponibles:");
        int numEjemplares = scanner.nextInt();
        scanner.nextLine();
        listaLibros.add(new Libro(codigoISBN, titulo, autor, numEjemplares));

        System.out.println("Libro registrado exitosamente.");
    }
}
    /*
    public void registrarUsuario() {
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su tipo de usuario (1=Alumno, 2=Profesor):");
        int tipoUsuario = scanner.nextInt();
        scanner.nextLine();
        if (tipoUsuario == 1) {
            listaUsuarios.add(new Alumnos(nombre));
        } else if (tipoUsuario == 2) {
            listaUsuarios.add(new Profesor(nombre));
        } else {
            System.out.println("Tipo de usuario no válido.");
        }
        System.out.println("Usuario registrado exitosamente.");
    }

    public void solicitarPrestamo() {
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        Usuario u
        if (usuario == null) {
            System.out.println("Usuario no registrado");
            return;
        }
        if (usuario.getListaPrestamos().size() >= 3) {
            System.out.println("Usted ya ha pedido 3 libros prestados, debe devolver uno antes de solicitar otro.");
            System.out.println("Desea devolver un libro? (s/n)");
            String respuesta = scanner.nextLine();
            if (respuesta.equals("s")) {
                registrarLibro(usuario);
            } else {
                return;
            }
        }
    }
}*/