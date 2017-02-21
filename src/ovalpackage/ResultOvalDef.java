package ovalpackage;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="oval_definitions")
@XmlAccessorType(XmlAccessType.FIELD)

public class ResultOvalDef {
	@XmlElement(name="generator")
	private Generator generator;
	
	@XmlElement(name="results")
	private Results results;
	
	@XmlAttribute
	private String xmlns;
	
	@XmlAttribute(name="xmlns:oval")
	private String xmlnsOval;
	
	@XmlAttribute(name="xmlns:xsi")
	private String xmlnsXsi;
	
	@XmlAttribute(name="xsi:schemaLocation")
	private String xsiSchemaLocation;
	
	public void setXmlns(String xmlns){
		this.xmlns = xmlns;
	}
	
	public String getXmlns(){
		return xmlns;
	}
	
	public void setXmlnsOval(String xmlnsOval){
		this.xmlnsOval = xmlnsOval;
	}
	
	public String getXmlnsOval(){
		return xmlnsOval;
	}
	
	public void setXmlnsXsi(String xmlnsXsi){
		this.xmlnsXsi = xmlnsXsi;
	}
	
	public String getXmlnsXsi(){
		return xmlnsXsi;
	}
	
	public void setXsiSchemaLocation(String xsiSchemaLocation){
		this.xsiSchemaLocation = xsiSchemaLocation;
	}
	
	public String getXsiSchemaLocation(){
		return xsiSchemaLocation;
	}
	
	public Generator getGenerator(){
		return generator;
	}
	
	public void setGenerator(Generator generator){
		this.generator = generator;
	}
	
	
	public Results getResults(){
		return results;
	}
	
	public void setResults(Results res){
		this.results = res;
	}
	
	
	
	

}
