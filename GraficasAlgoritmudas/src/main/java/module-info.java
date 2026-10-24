module com.example.graficasalgoritmudas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.graficasalgoritmudas to javafx.fxml;
    exports com.example.graficasalgoritmudas;
}