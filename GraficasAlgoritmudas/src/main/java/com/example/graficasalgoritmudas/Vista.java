package com.example.graficasalgoritmudas;

import javafx.scene.layout.HBox;

public class Vista {
    private Controlador controlador;
    private Graficas graficas;
    private HBox hbox;

    public Vista(){
        controlador = new Controlador();
        graficas = new Graficas();

        hbox = new HBox(10);
        hbox.setSpacing(10);

        hbox.getChildren().addAll(graficas.graficaIterativa(controlador), graficas.graficaRecursiva(controlador), graficas.graficaGaussiana(controlador));
    }

    public HBox getHbox() {
        return hbox;
    }
}
