//package workshop.PlaintextToHtmlConverter;

import java.util.ArrayList;

public class HTMLEncoder {
	private String text;
	private ArrayList<String> textLineList;
	private ArrayList<String> textLine;

	HTMLEncoder(String text){
		this.text = text;
		this.textLineList = new ArrayList<String>();
		this.textLine = new ArrayList<String>();
	}

	private void encodeChar(char textCharacter){
		switch(textCharacter){
			case '<':
				textLine.add("&lt;");
				break;
			case '>':
				textLine.add("&gt;");
				break;
			case '&':
				textLine.add("&amp;");
				break;
			case '\n':
				addANewLine();
				break;
			default:
				textLine.add(String.valueOf(textCharacter));
				break;
		}	
	}

	public String encode(){
		for(char character : text.toCharArray()){
			encodeChar(character);
		}		
		return String.join("",textLineList);
	}

	private void addANewLine(){
		String line = String.join("",textLine);
		textLineList.add(line);
		textLine = new ArrayList<>();
	}
}
