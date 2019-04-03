package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class WordEnhanced {
	private String Alienword;
	private List<String> translation;
	
	public WordEnhanced(String a ,String t) {
		this.Alienword=a;
		translation=new ArrayList<String>();
		this.translation.add(t);
		}

	public String getAlienword() {
		return Alienword;
	}

	public List getTranslation() {
		return translation;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj==this)
		{
			return true;
			}
		if (obj.getClass()==this.getClass()) {
			WordEnhanced cerca= (WordEnhanced)obj;
			if (cerca.getAlienword().compareTo(this.Alienword)==0)
				{return true;}
			}
			
	
	 return false;
	}

	public void setTranslation(String t) {
	this.translation.add(t);
		
	}
	
	

}
