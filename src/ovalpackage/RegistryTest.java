package ovalpackage;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class RegistryTest {
	//attributes
	@XmlAttribute(name="xmlns")
	private String xmlns;
	
	@XmlAttribute(name="id")
	private String id;
	
	@XmlAttribute(name="version")
	private String version;
	
	@XmlAttribute(name="comment")
	private String comment;
	
	@XmlAttribute(name="check_existence")
	private String checkExistence;
	
	@XmlAttribute(name="check")
	private String check;
	
	//child elements
	@XmlElement(name="object")
	private Obj obj;
	
	@XmlElement(name="state")
	private State state;

	public String getXmlns() {
		return xmlns;
	}

	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCheckExistence() {
		return checkExistence;
	}

	public void setCheckExistence(String checkExistence) {
		this.checkExistence = checkExistence;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public Obj getObj() {
		return obj;
	}

	public void setObj(Obj obj) {
		this.obj = obj;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
