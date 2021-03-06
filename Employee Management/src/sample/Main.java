package sample;

import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;
import javax.swing.text.html.ListView;
import java.io.*;

public class Main extends Application {

    static String fileName = "data.txt";


    public static void main(String[] args) {

        launch(args);
    }


    static UapCse uc = new UapCse();

    @Override
    public void start(Stage primaryStage) {
        uc=readData();
        new FrontPage();
    }
    private static UapCse readData() {
        UapCse myUap=new UapCse();

        try{
            FileInputStream fis=new FileInputStream(fileName);
            ObjectInputStream ois=new ObjectInputStream(fis);
           myUap=(UapCse)ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            System.out.println("No Data Available");
        }
        return myUap;
    }

    public static UapCse saveData(UapCse b) {


        try {


            ObjectOutputStream p = new ObjectOutputStream(new FileOutputStream(fileName));
            p.writeObject(b);
            p.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
        return b;
    }

}
