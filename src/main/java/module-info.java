module com.example.javaprojectwithtdd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaprojectwithtdd to javafx.fxml;
    exports com.example.javaprojectwithtdd;
}