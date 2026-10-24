package com.example.graficasalgoritmudas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controlador {
    private ArrayList<Long> valoresDeN = new ArrayList<>();
    private ArrayList<Long> tiemposIterativos = new ArrayList<>();
    private ArrayList<Long> tiemposGaussianos= new ArrayList<>();
    private ArrayList<Long> tiemposRecursivos = new ArrayList<>();

    public Controlador() {
        for (long i = 100; i <= 10000000; i *= 10) {
            long tiempoInicioIterativo = System.nanoTime();
           long valorIterativo = MetodosParaSumar.sumaIterativa(i);
            long tiempoFinIterativo = System.nanoTime();
            long tiempoInicioGaussiano = System.nanoTime();
           long valorGaussiano =  MetodosParaSumar.sumaGaussiana(i);
            long tiempoFinGaussiano = System.nanoTime();
            long tiempoInicioRecursivo = System.nanoTime();
            MetodosParaSumar.sumaRecursiva(i);
          long tiempoFinRecursivo = System.nanoTime();
            tiemposIterativos.add(tiempoFinIterativo - tiempoInicioIterativo);
            tiemposGaussianos.add(tiempoFinGaussiano - tiempoInicioGaussiano);
         tiemposRecursivos.add(tiempoFinRecursivo - tiempoInicioRecursivo);
         valoresDeN.add(i);
            IO.println("\n");
        }
    }


    public ArrayList<Long> getValoresDeN() {
        return valoresDeN;
    }

    public ArrayList<Long> getTiemposIterativos() {
        return tiemposIterativos;
    }

    public ArrayList<Long> getTiemposGaussianos() {
        return tiemposGaussianos;
    }

    public ArrayList<Long> getTiemposRecursivos() {
        return tiemposRecursivos;
    }
}
