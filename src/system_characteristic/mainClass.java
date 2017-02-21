package system_characteristic;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;



public class mainClass {
	
	static String SC_FILE = "src/system_characteristic/config.xml";

	public static String sendValue() throws JAXBException {
		// TODO Auto-generated method stub
		File file = new File(SC_FILE);
		JAXBContext jaxbContext = JAXBContext.newInstance(OvalDefinitions.class);
		javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		OvalDefinitions ovaldefinitions = (OvalDefinitions)  jaxbUnmarshaller.unmarshal(file);
		System.out.println("Value: " + ovaldefinitions.getsysdata().getFilelistnew().get(0).getValue().getValue());
		return ovaldefinitions.getsysdata().getFilelistnew().get(0).getValue().getValue();
		//System.out.println("Value: " + ovaldefinitions.getStates().getRegistryStates().get(0).getValue().getValue());
	
	}	
}
