module com.example.simplecalculator_syed {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.simplecalculator_syed to javafx.fxml;
    exports com.example.simplecalculator_syed;
}