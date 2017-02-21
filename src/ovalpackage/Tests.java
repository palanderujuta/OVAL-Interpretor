package ovalpackage;

import javax.xml.bind.annotation.*;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Tests {
	@XmlElement(name ="registry_test")
	private List<RegistryTest> registryTests = new ArrayList<RegistryTest>();

	public List<RegistryTest> getRegistryTests() {
		return registryTests;
	}

	public void setRegistryTests(List<RegistryTest> registryTests) {
		this.registryTests = registryTests;
	}
}
