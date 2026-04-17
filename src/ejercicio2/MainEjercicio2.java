package ejercicio2;

import java.util.ArrayList;

public class MainEjercicio2 
{

    public static void main(String[] args) 
    {

        ArrayList<Polideportivo> listaPolideportivos = new ArrayList<Polideportivo>();

        Polideportivo p1 = new Polideportivo("Polideportivo Escobar", 1500.0, 1);
        Polideportivo p2 = new Polideportivo("Polideportivo Tigre", 1800.5, 2);
        Polideportivo p3 = new Polideportivo("Polideportivo Pacheco", 2100.75, 3);

        listaPolideportivos.add(p1);
        listaPolideportivos.add(p2);
        listaPolideportivos.add(p3);
    }

}