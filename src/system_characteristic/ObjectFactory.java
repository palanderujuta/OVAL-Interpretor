package system_characteristic;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

	public ObjectFactory() {
		
	}
	
	public OvalDefinitions createOvalDefinitions(){
		return new OvalDefinitions();
	}
}
