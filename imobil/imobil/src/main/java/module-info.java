module imobil {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;

    opens imobil to javafx.fxml;
    exports imobil;
}
