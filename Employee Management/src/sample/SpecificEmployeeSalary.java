package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.Serializable;

public class SpecificEmployeeSalary implements Serializable {
    SpecificEmployeeSalary(){
        Stage primaryStage=new Stage();
        TextField tfId = new TextField();
        Button Add=new Button("OK");

        Label label = new Label("Enter Id");


        VBox layout = new VBox();
        tfId.setMaxWidth(100);
        layout.getChildren().addAll(label,tfId,Add);
        Scene secondScene = new Scene(layout, 500, 250);
        secondScene.getStylesheets().add(getClass().getResource("Viper.css").toExternalForm());
        Stage newWindow = new Stage();
        newWindow.setTitle("Enter Requires Data");
        newWindow.setScene(secondScene);
        newWindow.setX(primaryStage.getX() + 350);
        newWindow.setY(primaryStage.getY() + 0);

        newWindow.show();
        Add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                JOptionPane.showMessageDialog(null,"Salary: "+Main.uc.getSalary(tfId.getText()),"Salary",JOptionPane.PLAIN_MESSAGE);
                newWindow.close();
            }
        });
    }
}
