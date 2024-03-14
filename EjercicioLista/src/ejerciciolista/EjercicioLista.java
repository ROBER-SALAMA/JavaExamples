package ejerciciolista;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class EjercicioLista {
    public static void main(String[] args) {
        Scanner EntradaConsola = new Scanner(System.in);
        //variable tipo voleana
        boolean continuarRegistro = true;
        ArrayList<Empleado> ListaEmpleado = new ArrayList<>(); // Crear un ArrayList para almacenar los empleados

        while (continuarRegistro) {
            System.out.println("Ingrese el ID del empleado: ");
            int id = EntradaConsola.nextInt();
            EntradaConsola.nextLine(); // Limpiar el buffer

            System.out.println("Ingrese el nombre del empleado: ");
            String nombre = EntradaConsola.nextLine();

            System.out.println("Ingrese el apellido del empleado: ");
            String apellido = EntradaConsola.nextLine();

            System.out.println("Ingrese el departamento del empleado: ");
            String departamento = EntradaConsola.nextLine();

            System.out.println("Ingrese el salario del empleado: ");
            double salario = EntradaConsola.nextDouble();
            EntradaConsola.nextLine(); // Limpiar el buffer

            // Crear un nuevo objeto Empleado con los datos ingresados
            Empleado empleado = new Empleado(id, nombre, apellido, departamento, salario);

            // Agregar el empleado al ArrayList
            ListaEmpleado.add(empleado);

            System.out.println("¿Desea registrar otro empleado? (S/N)");
            String respuesta = EntradaConsola.nextLine();

            if (respuesta.equalsIgnoreCase("N")) {
                continuarRegistro = false;
            }
        }   
        // Imprimir los empleados registrados
        System.out.println("Empleados registrados:");
        Iterator<Empleado> iterator = ListaEmpleado.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            System.out.println("ID: " + empleado.getId());
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Apellido: " + empleado.getApellido());
            System.out.println("Departamento: " + empleado.getDepartamento());
            System.out.println("Salario: " + empleado.getSalario());
            System.out.println("---------------------------");
        }
    }
}
