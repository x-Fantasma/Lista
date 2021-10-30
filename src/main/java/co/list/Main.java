package main.java.co.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();

        Estudiante camilo = new Estudiante(1L, 8, 1000, 20);
        Estudiante alejandra = new Estudiante(2L, 9, 1000, 25);
        Estudiante bryan = new Estudiante(3L, 10, 1000, 30);
        Estudiante andres = new Estudiante(4L, 11, 1000, 35);

        estudiantes.add(camilo);
        estudiantes.add(alejandra);
        estudiantes.add(bryan);
        estudiantes.add(andres);

        String textoAMostrar = "";
        Long nroCarnetQuePagaMas = 0L;
        float valorMasCaro = 0;

        for(Estudiante estudiante: estudiantes) {
            // Se concatena el texto a mostrar de cada estudante
            textoAMostrar += "Estudiante: "
                    .concat(estudiante.getNroCarnet().toString())
                    .concat(" ")
                    .concat("Valor creditos: ")
                    .concat(
                            // Se convierte a texto el valor double obtenido al llamar el metodo obtenerCostoDeCreditos(...)
                            Double.toString(estudiante.getNroCreditos() * estudiante.getValorCredito()))

                    .concat("\n");

            if(estudiante.getValorCredito() > valorMasCaro) {
                valorMasCaro = estudiante.getValorCredito();
                nroCarnetQuePagaMas = estudiante.getNroCarnet();
            }

        }

        textoAMostrar += "\nEstudiante que mas paga por credito: " + nroCarnetQuePagaMas.toString();
        System.out.println(textoAMostrar);

    }
}
