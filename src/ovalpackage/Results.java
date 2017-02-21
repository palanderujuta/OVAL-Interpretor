package ovalpackage;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Results {
	
	@XmlElement(name="definitions")
	private List<Definitions> definitions = new ArrayList<Definitions>();
	
	public void setDefi(List<Definitions> definitions){
		this.definitions = definitions;
	}
	
	public List<Definitions> getDef(){
		return definitions;
	}
	

}
