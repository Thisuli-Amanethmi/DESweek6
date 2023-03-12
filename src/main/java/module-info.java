module com.example.desweek6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desweek6 to javafx.fxml;
    exports com.example.desweek6;
}