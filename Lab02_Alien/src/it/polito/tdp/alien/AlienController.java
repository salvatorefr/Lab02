package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	AlienDictionary model;
	
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
   String text;
    text=this.textIntrodotto.getText();
    text=text.toLowerCase();
  
    if ((text.matches("(([a-z])|\\s){1,20}"))){
    		String []parIns=text.split(" ");
    		if (parIns.length==2)
    		{
    			model.addWord(parIns[0],parIns[1]);
    			scrivi("parola inserita\n");
    			return;
		
    		}
    		if (parIns.length==1) {
    			try {
    				String traduzione=	model.translateWord(parIns[0]).concat("\n");
    				scrivi(traduzione);
    			}catch(NullPointerException e)
    			{
    				scrivi("parola non presente\n");
    			}
    		}

	
    		else scrivi("errore, digita una parola per cercarne il significato\n");
    		}

    		else scrivi("hai inserito caratteri non validi");
    	    	
     }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	model.reset();
    	this.txtResult.clear();

    }


	public void setModel(AlienDictionary model) {
		this.model=model;
		
	}
	


	private void scrivi(String stampa) {
		 this.txtResult.appendText(stampa);
		
	}
    
}
