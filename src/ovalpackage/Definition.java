package ovalpackage;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Definition {
	//attributes
	@XmlAttribute(name="id")
	private String id;
	
	@XmlAttribute(name="version")
	private String version;
	
	@XmlAttribute(name="result")
	private boolean result;
	
	@XmlAttribute(name="class")
	private String classtype;
	
	//child elements
	@XmlElement(name="metadata")
	private Metadata metadata;
	
	@XmlElement(name="criteria")
	private Criteria criteria;
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	
	public boolean getResult(){
		return true;
	}
	
	public void setResult(boolean b)
	{
		this.result=b;
	}
	public void setVersion(String version){
		this.version = version;
	}
	public String getVersion(){
		return version;
	}
	
	public String getClasstype() {
		return classtype;
	}
	public void setClasstype(String classtype) {
		this.classtype = classtype;
	}

	public Metadata getMetadata() {
		return metadata;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public Criteria getCriteria() {
		return criteria;
	}
	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}
}
