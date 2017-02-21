package ovalpackage;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class RegistryState {
	@XmlAttribute(name="xmlns")
	private String xmlns;
	
	@XmlAttribute(name="id")
	private String id;
	
	@XmlAttribute(name="version")
	private String version;
	
	@XmlAttribute(name="comment")
	private String comment;
	
	@XmlElement(name="type")
	private String type;
	
	@XmlElement(name="value")
	private Value value;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}
}
