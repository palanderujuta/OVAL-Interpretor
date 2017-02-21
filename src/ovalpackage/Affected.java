package ovalpackage;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Affected {
	@XmlAttribute(name="family")
	private String family;
	
	@XmlElement(name="platform")
	private String platform;
	
	public void setFamily(String family){
		this.family = family;
	}
	
	public String getFamily(){
		return family;
	}
	
	public void setPlatform(String platform){
		this.platform = platform;
	}
	
	public String getPlatform(){
		return platform;
	}
}
