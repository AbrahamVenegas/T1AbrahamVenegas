module com.example.t1abrahamvenegas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.t1abrahamvenegas to javafx.fxml;
    exports com.example.t1abrahamvenegas;
}