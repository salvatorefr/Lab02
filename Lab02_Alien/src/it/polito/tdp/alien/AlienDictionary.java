package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;


public class AlienDictionary{
	
	private List <WordEnhanced> dizionario;
	
	public AlienDictionary() {
		dizionario= new ArrayList<WordEnhanced>();
	}
	public void addWord(String a,String t) {
		WordEnhanced w=new WordEnhanced(a,t);
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
		WordEnhanced cerca= new WordEnhanced (daCercare,"");
		if ( dizionario.contains(cerca)){
			int indice= dizionario.indexOf(cerca);
			return dizionario.get(indice).getTranslation().toString();
		}
		else return null;
	}
	
		
	

	
	
}
