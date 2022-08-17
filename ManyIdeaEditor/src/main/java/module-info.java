module com.github.distriful5061.manyidea.manyideaeditor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.github.distriful5061.manyidea.manyideaeditor to javafx.fxml;
    exports com.github.distriful5061.manyidea.manyideaeditor;
}