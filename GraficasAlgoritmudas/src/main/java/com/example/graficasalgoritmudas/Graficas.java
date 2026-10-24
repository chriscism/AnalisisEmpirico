package com.example.graficasalgoritmudas;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.shape.Line;

public class Graficas {
    public LineChart graficaIterativa(Controlador controlador){
        final NumberAxis ejeX = new NumberAxis();
        final NumberAxis ejeY = new NumberAxis();
        ejeX.setLabel("Valor de n");
        ejeY.setLabel("t (ns)");
        LineChart<Number,Number> grafica = new LineChart<>(ejeX, ejeY);
        XYChart.Series series = new XYChart.Series();
        series.setName("datos");
        for(int i = 0; i < controlador.getValoresDeN().size(); i++) series.getData().add(new XYChart.Data(controlador.getValoresDeN().get(i), controlador.getTiemposIterativos().get(i)));
        grafica.getData().add(series);
        grafica.setTitle("Sumatoria iterativa");
        return grafica;
    }
    public LineChart graficaRecursiva(Controlador controlador){
        final NumberAxis ejeX = new NumberAxis();
        final NumberAxis ejeY = new NumberAxis();
        ejeX.setLabel("Valor de n");
        ejeY.setLabel("t (ns)");
        LineChart<Number,Number> grafica = new LineChart<>(ejeX, ejeY);
        XYChart.Series series = new XYChart.Series();
        series.setName("datos");
        for(int i = 0; i < controlador.getValoresDeN().size(); i++) series.getData().add(new XYChart.Data(controlador.getValoresDeN().get(i), controlador.getTiemposRecursivos().get(i)));
        grafica.getData().add(series);
        grafica.setTitle("Sumatoria recursiva");
        return grafica;
    }
    public LineChart graficaGaussiana(Controlador controlador){
        final NumberAxis ejeX = new NumberAxis();
        final NumberAxis ejeY = new NumberAxis();
        ejeX.setLabel("Valor de n");
        ejeY.setLabel("t (ns)");
        LineChart<Number,Number> grafica = new LineChart<>(ejeX, ejeY);
        XYChart.Series series = new XYChart.Series();
        series.setName("datos");
        for(int i = 0; i < controlador.getValoresDeN().size(); i++) series.getData().add(new XYChart.Data(controlador.getValoresDeN().get(i), controlador.getTiemposGaussianos().get(i)));
        grafica.getData().add(series);
        grafica.setTitle("Sumatoria gaussiana");
        return grafica;
    }
}
