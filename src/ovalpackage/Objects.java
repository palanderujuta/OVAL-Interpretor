package ovalpackage;

import javax.xml.bind.annotation.*;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Objects {
	@XmlElement(name="registry_object")
	private List<RegistryObject> registryObjects = new ArrayList<RegistryObject>();

	public List<RegistryObject> getRegistryObjects() {
		return registryObjects;
	}

	public void setRegistryObjects(List<RegistryObject> registryObjects) {
		this.registryObjects = registryObjects;
	}
}
