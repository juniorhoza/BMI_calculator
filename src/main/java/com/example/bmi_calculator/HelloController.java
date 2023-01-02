package com.example.bmi_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

   public TextField weight;
    public TextField height;
    public  Button calculate;

    public Label result;
    public Label condition;



    public void calculateBMI  (ActionEvent e){
        try{
            double answer =  Double.parseDouble(weight.getText()) /
                    Math.pow(Double.parseDouble(height.getText()),2);
            result.setText("       "+ answer );
            if(answer < 18.5 ){
                condition . setText( "       "+"Under Weight");
            }
            else if( answer > 18.5 && answer < 24.9){
                condition . setText( "       "+"Normal");

            }
            else if( answer > 25 && answer < 29.9){
                condition . setText( "       "+"Over Wight");

            }
            else if( answer > 30 && answer < 34.9){
                condition . setText( "       "+"Obese");

            }
            else if( answer > 35){
                condition . setText( "       "+"Extremly Obese");

            }
        }catch (NumberFormatException ex){
            result.setText("number comversion inpossible , check your inputs");
        }
    }

}