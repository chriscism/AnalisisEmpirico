package com.example.graficasalgoritmudas;

public class MetodosParaSumar {

    public static long sumaIterativa(long n){
        int sumatoria = 0;
        for(int i = 0; i <=  n; i++) sumatoria += i;
        return  sumatoria;
    }

    public static long sumaRecursiva(long n){
        if(n == 0) return 0;
        return n + sumaRecursiva(n - 1);
    }

    public static long sumaGaussiana(long n){
        return (n*(n+1))/2;
    }
}
