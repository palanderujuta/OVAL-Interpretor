package ovalpackage;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class RegistryObject {
	@XmlAttribute(name="xmlns")
	private String xmlns;
	
	@XmlAttribute(name="id")
	private String id;
	
	@XmlAttribute(name="version")
	private String version;
	
	@XmlElement(name="hive")
	private Hive hive;
	
	@XmlElement(name="key")
	private Key key;
	
	@XmlElement(name="name")
	private Name name;

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

	public Hive getHive() {
		return hive;
	}

	public void setHive(Hive hive) {
		this.hive = hive;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}
}
