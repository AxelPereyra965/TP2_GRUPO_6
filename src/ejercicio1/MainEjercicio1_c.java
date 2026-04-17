package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_c {

    public static void main(String[] args) {

        Empleado e1 = new Empleado("20111111", "Juan", "Perez", null, "", "", "", "", "Admin");
        Empleado e2 = new Empleado("20222222", "Ana", "Gomez", null, "", "", "", "", "Ventas");
        Empleado e3 = new Empleado("20333333", "Luis", "Martinez", null, "", "", "", "", "IT");
        Empleado e4 = new Empleado("20444444", "Sofia", "Lopez", null, "", "", "", "", "RRHH");
        Empleado e5 = new Empleado("20555555", "Carlos", "Diaz", null, "", "", "", "", "Soporte");
        
        TreeSet<Empleado> listaEmpleados = new TreeSet<Empleado>();

        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        listaEmpleados.add(e4);
        listaEmpleados.add(e5);
        
        System.out.println("=== Listado de empleados ===");
        Iterator<Empleado> it = listaEmpleados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Próximo legajo disponible: " + Empleado.devuelveProximoLegajo());
    }

}
