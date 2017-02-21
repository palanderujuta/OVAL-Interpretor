package ovalpackage;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Reference {
	@XmlAttribute(name="source")
	private String source;
	
	@XmlAttribute(name="ref_id")
	private String refId;
	
	@XmlAttribute(name="ref_url")
	private String refUrl;
	
	public void setSource(String source){
		this.source = source;
	}
	
	public String getSource(){
		return source;
	}
	
	public void setRefId(String refId){
		this.refId = refId;
	}
	
	public String getRefId(){
		return refId;
	}
	
	public void setRefUrl(String refUrl){
		this.refUrl = refUrl;
	}
	
	public String getRefUrl(){
		return refUrl;
	}
}
