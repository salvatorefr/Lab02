package it.polito.tdp.alien.alienModel;

import java.util.ArrayList;
import java.util.List;


public class AlienModel{
	
	private List <Word> dizionario;
	
	public AlienModel() {
		dizionario= new ArrayList<Word>();
	}
	public void addWord(Word w) {
		dizionario.add(w);
		
	}
	public void removeWord(Word e) {
		
	}

	public void reset() {
		this.dizionario.clear();
		
	}
	public String decidi(String text) {
	String []parIns=text.split(" ");
	if (parIns.length==2) {
		Word daInserire= new Word(parIns[0],parIns[1]);
		this.addWord(daInserire);
		return "parola inserita";
		
	}
	if (parIns.length==1) {
		Word daTradurre= new Word(parIns[0],"");
	if (dizionario.contains(daTradurre)) {
		return dizionario.get(dizionario.indexOf(daTradurre)).getTranslation();
		 
	}
	return "parola non presente";
	}
	else return "errore, digita una parola per cercarne il significato";
	
		
	}

	
	
}
