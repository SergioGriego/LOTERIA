package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Random;
import java.util.Stack;

public class Controller {
    @FXML
    Label lb1, lb2, lb3, lb4;
    @FXML
    Button BtnCalcular;
    Hilo h1, h2, h3, h4;


    public void Calcular(ActionEvent event) {
        if (BtnCalcular.getText().equals("Generar")) {
            h1 = new Hilo(lb1);
            h2 = new Hilo(lb2);
            h3 = new Hilo(lb3);
            h4 = new Hilo(lb4);
            h1.start();
            h2.start();
            h3.start();
            h4.start();
            BtnCalcular.setText("Detener");
//            lb1.setVisible(true);
//            lb2.setVisible(true);
//            lb3.setVisible(true);
//            lb4.setVisible(true);


        } else {
            //if (lb1.getText() != lb2.getText() && lb1.getText() != lb3.getText() && lb1.getText() != lb4.getText()) {
                h1.stop();
                if (lb2.getText() != lb1.getText() && lb2.getText() != lb3.getText() && lb2.getText() != lb4.getText()) {
                    h2.stop();
                    if (lb3.getText() != lb1.getText() && lb3.getText() != lb2.getText() && lb3.getText() != lb4.getText()) {
                        h3.stop();
                        if (lb4.getText() != lb1.getText() && lb4.getText() != lb2.getText() && lb4.getText() != lb3.getText()) {
                            h4.stop();
                        }
                    }
                }
            //}
//            //int pos;
//            int numero=4;
//            Stack< Integer > cant = new Stack < Integer > ();
//            int r;
//            Random random=new Random();
//            for (int i = 0; i < numero ; i++) {
//                //pos = (int) Math.floor(Math.random() * numero );
//                r=random.nextInt(5);
//                while (cant.contains(r)) {
//                    //pos = (int) Math.floor(Math.random() * numero );
//                    r=random.nextInt(5);
//                }
//                cant.push(r);
//            }
//           // System.out.println("Tus números son:");
//            //System.out.println(cant.toString());
//            lb1.setText(cant.toString());
//            lb2.setVisible(false);
//            lb3.setVisible(false);
//            lb4.setVisible(false);

            BtnCalcular.setText("Generar");
        }
    }
}
