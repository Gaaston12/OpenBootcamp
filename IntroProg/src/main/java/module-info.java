module com.example.openbootcamp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.openbootcamp to javafx.fxml;
    exports com.example.openbootcamp;
}