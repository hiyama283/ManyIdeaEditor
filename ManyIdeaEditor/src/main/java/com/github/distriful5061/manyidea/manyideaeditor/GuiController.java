package com.github.distriful5061.manyidea.manyideaeditor;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class GuiController implements Initializable {
    /* Sample
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
     */

    protected Tab getDefaultTab(String title) {
        Tab tab = new Tab();
        tab.setText(title);

        TextArea textArea1 = new TextArea();
        textArea1.setPrefWidth(1200);
        textArea1.setPrefHeight(558);
        textArea1.setLayoutY(6);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setPrefWidth(200);
        anchorPane.setPrefHeight(180);
        anchorPane.setMinWidth(0);
        anchorPane.setMinHeight(0);
        anchorPane.getChildren().add(textArea1);

        tab.setContent(anchorPane);
        return tab;
    }

    @FXML
    private TabPane editorTabPaneArea;

    @FXML
    protected void onAddTabButton() {
        editorTabPaneArea.getTabs().add(getDefaultTab("Untitled"));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        getDefaultTab("Untitled");
    }
}