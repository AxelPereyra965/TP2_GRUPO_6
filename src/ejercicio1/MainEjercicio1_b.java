package ejercicio1;

public class MainEjercicio1_b {

    public static void main(String[] args) {
    	
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    	
        Empleado e1 = new Empleado(
                "12345678", "Joel", "González",
                LocalDate.of(1995, 4, 23),
                "Masculino", "Av. Siempre Viva 123", "1122334455", "joel@mail.com",
                "Desarrollador"
            );

            Empleado e2 = new Empleado(
                "23456789", "Ana", "Martínez",
                LocalDate.of(1998, 8, 10),
                "Femenino", "Calle Falsa 456", "1166778899", "ana@mail.com",
                "Analista QA"
            );

            Empleado e3 = new Empleado(
                "34567890", "Carlos", "Ruiz",
                LocalDate.of(1990, 12, 5),
                "Masculino", "Boulevard Central 789", "1199887766", "carlos@mail.com",
                "Gerente de Proyecto"
            );
            
            Empleado e4 = new Empleado(
                    "45678959", "Horacio", "Perez",
                    LocalDate.of(1993, 6, 18),
                    "Masculino", "Calle Los Troncos 637", "1195063302", "Horacio@mail.com",
                    "Diseñador UX/UI"
            );

            Empleado e5 = new Empleado(
                "45678901", "Sebastián", "López",
                LocalDate.of(1993, 6, 18),
                "Masculino", "Calle Los Álamos 321", "1155663322", "sebas@mail.com",
                "Diseñador UX/UI"
            );

            listaEmpleados.add(e1);
            listaEmpleados.add(e2);
            listaEmpleados.add(e3);
            listaEmpleados.add(e4);
            listaEmpleados.add(e5);
            
            System.out.println("=== Listado de todos los empleados (Iterator) ===");
            Iterator<Empleado> it = listaEmpleados.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
            
            System.out.println("Próximo legajo disponible: " + Empleado.devuelveProximoLegajo());

        
    }

}