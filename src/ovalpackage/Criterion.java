package ovalpackage;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Criterion {
	@XmlAttribute(name="test_ref")
	private String testRef;
	
	@XmlAttribute(name="comment")
	private String comment;
	
	@XmlAttribute(name="negate")
	private String negate;
	
	public void setTestRef(String testRef){
		this.testRef = testRef;
	}
	
	public String getTestRef(){
		return testRef;
	}
	
	public void setComment(String comment){
		this.comment = comment;
	}
	
	public String getComment(){
		return comment;
	}
	
	public void setNegate(String negate){
		this.negate = negate;
	}
	
	public String getNegate(){
		return negate;
	}
}
