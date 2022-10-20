package com.interfaces.actividaduf1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.stage.Stage;

import java.io.IOException;

public class Aplicacion extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        //Create the FMXLLoader
        FXMLLoader fxmlLoader = new FXMLLoader(Aplicacion.class.getResource("main.fxml"));


        //Create de Scene
        Scene scene = new Scene(fxmlLoader.load());
        //Set the Scene to the Stage
        stage.setScene(scene);
        //Set the Title to the Stage
        stage.setTitle("A SceneBuilder Example");

        //Display Stage
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}