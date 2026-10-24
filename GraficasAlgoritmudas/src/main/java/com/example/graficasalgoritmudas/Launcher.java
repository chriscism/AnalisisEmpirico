package com.example.graficasalgoritmudas;

import javafx.application.Application;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        ArrayList<Long> tiemposSumaIterativa = new ArrayList<>();
        ArrayList<Long> tiempoSumaGaussiana = new ArrayList<>();
        ArrayList<Long> tiempoSumaRecursiva = new ArrayList<>();
        ArrayList<Long> valoresDeN = new ArrayList<>();
        for (long i = 100; i <= 100000000; i *= 10) {
            long tiempoInicioIterativo = System.nanoTime();
            MetodosParaSumar.sumaIterativa(i);
            long tiempoFinIterativo = System.nanoTime();
            long tiempoInicioGaussiano = System.nanoTime();
            MetodosParaSumar.sumaGaussiana(i);
            long tiempoFinGaussiano = System.nanoTime();
            long tiempoInicioRecursivo = System.nanoTime();
            //  MetodosParaSumar.sumaRecursiva(i);
            long tiempoFinRecursivo = System.nanoTime();
            tiemposSumaIterativa.add(tiempoFinIterativo - tiempoInicioIterativo);
            tiempoSumaGaussiana.add(tiempoFinGaussiano - tiempoInicioGaussiano);
            tiempoSumaRecursiva.add(tiempoFinRecursivo - tiempoInicioRecursivo);
            valoresDeN.add(i);
            IO.println("n = " + i);
            IO.println("Tiempo de ejecución iterativo: " + (tiempoFinIterativo - tiempoInicioIterativo));
            // IO.println("Tiempo de ejecución recursivo: " + (tiempoFinRecursivo - tiempoInicioRecursivo));
            IO.println("Tiempo de ejecución gaussiano: " + (tiempoFinGaussiano - tiempoInicioGaussiano));

            IO.println("\n");
        }
    }
}
