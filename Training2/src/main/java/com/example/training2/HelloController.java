package com.example.training2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    public void up(ActionEvent e){
        myCircle.setCenterY(y-=10);
    }
    public void down(ActionEvent e){
        myCircle.setCenterY(y+=10);
    }

    public void left(ActionEvent e){
        myCircle.setCenterX(x-=10);
    }

    public void right(ActionEvent e){
        myCircle.setCenterX(x+=10);
    }
}