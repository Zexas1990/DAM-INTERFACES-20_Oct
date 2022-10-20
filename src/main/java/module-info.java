module com.interfaces.actividaduf1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.interfaces.actividaduf1 to javafx.fxml;
    exports com.interfaces.actividaduf1;
}