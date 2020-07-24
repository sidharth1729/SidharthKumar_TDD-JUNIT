package com.epam.tddjunitassignment;

public class removeChars{
	private String str;

	public String remove(String str) {
		if(str.length()<2) {
			if(str.length()==1 && str.charAt(0)!='A') {
				this.str = str;
				str = this.str;
			} else{
				str="";
			}
		}
		else {
		if(str.charAt(0)=='A' && str.charAt(1)=='A') {
		 str = str.substring(2,str.length());
		}
		else if(str.charAt(1)=='A' && str.charAt(0)!='A') {
			str= str.charAt(0)+str.substring(2,str.length());

		}
		else if(str.charAt(0)=='A'&& str.charAt(1)!='A') {
			str= str.substring(1,str.length());
		}
		
		}

  	return str;
	
	}

}
