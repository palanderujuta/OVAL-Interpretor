package system_characteristic;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Obj {
	@XmlAttribute(name="object_ref")
	private String objectRef;

	public String getObjectRef() {
		return objectRef;
	}

	public void setObjectRef(String objectRef) {
		this.objectRef = objectRef;
	}
}
