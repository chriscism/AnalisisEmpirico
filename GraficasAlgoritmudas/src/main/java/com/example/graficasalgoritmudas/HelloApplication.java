package com.example.graficasalgoritmudas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Vista vista = new Vista();
        Scene scene = new Scene(vista.getHbox(), 1200, 400);
        stage.setTitle("Comparación de algoritmos para sumatoria");
        stage.setScene(scene);
        stage.show();
    }
}
