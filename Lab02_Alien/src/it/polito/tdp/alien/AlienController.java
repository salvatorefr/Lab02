package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.alienModel.AlienModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	AlienModel model;
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField textIntrodotto;

    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert textIntrodotto != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    this.txtResult.clear();
    
    String stampa,txtInserito;
    txtInserito=this.textIntrodotto.getText();
    stampa=model.decidi(txtInserito);
    this.txtResult.appendText(stampa);
    	    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	model.reset();
    	this.txtResult.clear();

    }


	public void setModel(AlienModel model) {
		this.model=model;
		
	}
    
    
}
