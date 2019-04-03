package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;


public class AlienDictionary{
	
	private List <Word> dizionario;
	
	public AlienDictionary() {
		dizionario= new ArrayList<Word>();
	}
	public void addWord(String a,String t) {
		Word w=new Word(a,t);
		if (this.dizionario.contains(w)){
		 int indice= dizionario.indexOf(w);
		 this.dizionario.get(indice).setTranslation(t);
		}
		else
		dizionario.add(w);
		
	}
	public void removeWord(Word e) {
		if (this.dizionario.contains(e)){
			 int indice= dizionario.indexOf(e);
			 this.dizionario.remove(indice);
	
		}
	}

	public void reset() {
		this.dizionario.clear();
		
	}
	public String translateWord(String daCercare) {
		Word cerca= new Word (daCercare,"");
		if ( dizionario.contains(cerca)){
			int indice= dizionario.indexOf(cerca);
			return dizionario.get(indice).getTranslation();
		}
		else return null;
	}
	
		
	

	
	
}
