package com.interfaces.actividaduf1;


import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {


    public Button btn;
    public TextField inputTxt;
    public TextArea outTxt;

    public void OnClick( ) {
        String nombre = inputTxt.getText();
        outTxt.setText("Hola " + nombre);



    }
}