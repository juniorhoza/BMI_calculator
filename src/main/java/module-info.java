module com.example.bmi_calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.bmi_calculator to javafx.fxml;
    exports com.example.bmi_calculator;
}