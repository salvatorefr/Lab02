package it.polito.tdp.alien;

public class Word {
	private String Alienword;
	private String translation;
	
	public Word(String a ,String t) {
		this.Alienword=a;
		this.translation=t;
		}

	public String getAlienword() {
		return Alienword;
	}

	public String getTranslation() {
		return translation;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj==this)
		{
			return true;
			}
		if (obj.getClass()==this.getClass()) {
			Word cerca= (Word)obj;
			if (cerca.getAlienword().compareTo(this.Alienword)==0)
				{return true;}
			}
			
	
	 return false;
	}

	public void setTranslation(String t) {
	this.translation=t;
		
	}
	
	

}
