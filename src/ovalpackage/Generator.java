package ovalpackage;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Generator {
	
	@XmlElement(name="product_name")
	private String productName;
	
	@XmlElement(name="schema_version")
	private String schemaVersion;
	
	@XmlElement(name="timestamp")
	private String timestamp;
	
	public void setProductName(String productName){
		this.productName = productName;
	}
	
	public String getProductName(){
		return productName;
	}
	
	public void setSchemaVersion(String schemaVersion){
		this.schemaVersion = schemaVersion;
	}
	
	public String getSchemaVersion(){
		return schemaVersion;
	}
	
	public void setTimestamp(String timestamp){
		this.timestamp = timestamp;
	}
	
	public String getTimestamp(){
		return timestamp;
	}
	
}
