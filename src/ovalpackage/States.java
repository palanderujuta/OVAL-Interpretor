package ovalpackage;

import javax.xml.bind.annotation.*;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class States {
	@XmlElement(name="registry_state")
	private List<RegistryState> registryStates = new ArrayList<RegistryState>();

	public List<RegistryState> getRegistryStates() {
		return registryStates;
	}

	public void setRegistryStates(List<RegistryState> registryStates) {
		this.registryStates = registryStates;
	}
	
}
