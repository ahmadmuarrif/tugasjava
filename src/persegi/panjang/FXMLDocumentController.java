/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persegi.panjang;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author AiphLepi
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label lblhasil1, lblhasil2, lblbahas;
    @FXML
    private TextField txtjari;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        double jari = Double.parseDouble(txtjari.getText());
        int keliling = (int) (Math.PI * 2 * jari);
        int luas = (int) (Math.PI * jari * jari);
        lblbahas.setText("Hasil dan Pembahasan");
        lblhasil1.setText("Hasilnya perhitungan keliling lingkaran dengan jari-jari " + txtjari.getText() + " adalah " + keliling);
        lblhasil2.setText("Sedangkan luas lingkaran tersebut adalah "  + luas);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
