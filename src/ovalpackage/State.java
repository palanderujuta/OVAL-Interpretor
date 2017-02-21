package ovalpackage;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class State {
	@XmlAttribute(name="state_ref")
	private String stateRef;

	public String getStateRef() {
		return stateRef;
	}

	public void setStateRef(String stateRef) {
		this.stateRef = stateRef;
	}
}
