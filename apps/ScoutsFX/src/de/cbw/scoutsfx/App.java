/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cbw.scoutsfx;

import de.cbw.scoutsfx.model.Scout;
import de.cbw.scoutsfx.model.ScoutMapper;
import java.time.LocalDate;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
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
    
    private final ScoutMapper mapper = new ScoutMapper();
    
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
 
    private void setColsTable(){
        TableColumn<Scout, Integer> c1 = new TableColumn<>();
        
    }
}