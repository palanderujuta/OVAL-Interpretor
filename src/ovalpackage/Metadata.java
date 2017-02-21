package ovalpackage;

import javax.xml.bind.annotation.*;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Metadata {
	@XmlElement(name="title")
	private String title;
	
	@XmlElement(name="affected")
	private Affected affected;
	
	@XmlElement(name="reference")
	private List<Reference> references = new ArrayList<Reference>();
	
	@XmlElement(name="description")
	private String description;
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setAffected(Affected affected){
		this.affected = affected;
	}
	
	public Affected getAffected(){
		return affected;
	}
	
	public void setReferences(List<Reference> references){
		this.references = references;
	}
	
	public List<Reference> getReferences(){
		return references;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getDescription(){
		return description;
	}
}
