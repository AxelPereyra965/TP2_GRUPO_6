package ejercicio1;

public class MainEjercicio1_b {

    public static void main(String[] args) {
    	
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
        
    }

}