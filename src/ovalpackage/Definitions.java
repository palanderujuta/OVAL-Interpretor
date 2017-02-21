package ovalpackage;

import javax.xml.bind.annotation.*;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Definitions {
	@XmlElement(name="definition")
	private List<Definition> definitions = new ArrayList<Definition>();
	
	public void setDefinitions(List<Definition> definitions){
		this.definitions = definitions;
	}
	
	public List<Definition> getDefinitions(){
		return definitions;
	}
}
