package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.accessibility.Accessible;
import javax.swing.*;
import java.io.Serializable;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

public class AddSpecificEmployeeDis implements Serializable {
    AddSpecificEmployeeDis(){
        Stage primaryStage=new Stage();
        TextField tfId = new TextField();
        TextField tfName = new TextField();
        TextField tfDes = new TextField();
        TextField tfSal = new TextField();
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
                Main.uc.display(tfId.getText());
//                UapCse uc=new UapCse();
//                JOptionPane.showMessageDialog(null,Main.uc.display(tfId.getText()),"Display", JOptionPane.OK_CANCEL_OPTION);

                newWindow.close();
            }
        });
    }
}
