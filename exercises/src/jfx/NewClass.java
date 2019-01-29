/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfx;

/**
 *
 * @author 2923201
 */
package de.lubowiecki.fxscouts;
 
import de.lubowiecki.scouts.model.Scout;
import java.time.LocalDate;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
/**
 *
 * @author T.Lubowiecki
 */
public class App extends Application {
   
    private final Label lblFirstname = new Label("Vorname");
    private final TextField txtFirstname = new TextField();
   
    private final Label lblLastname = new Label("Nachname");
    private final TextField txtLastname = new TextField();
   
    private final Label lblBirthdate = new Label("Geburtsdatum");
    private final DatePicker picBirthdate = new DatePicker(LocalDate.now());
   
    private final Button btnSave = new Button("Speichern");
    private final Button btnDelete = new Button("Löschen");
    private final Button btnEdit = new Button("Ändern");
   
    private final TableView<Scout> tblScouts = new TableView<>();
   
    @Override
    public void start(Stage primaryStage) {
       
        VBox form = new VBox(10,
                new HBox(10, lblFirstname, txtFirstname),
                new HBox(10, lblLastname, txtLastname),
                new HBox(10, lblBirthdate, picBirthdate),
                new HBox(10, btnSave, btnEdit, btnDelete)
        );
       
        VBox box = new VBox(10,
                form,
                tblScouts
        );
       
        StackPane root = new StackPane();
        root.getChildren().add(box);
        Scene scene = new Scene(root, 500, 400);
       
        primaryStage.setTitle("Scout Verwaltung");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
   
}