package ovalpackage;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="oval_definitions")
@XmlAccessorType(XmlAccessType.FIELD)
public class OvalDefinitions {
	@XmlElement(name="generator")
	private Generator generator;
	
	@XmlElement(name="definitions")
	private Definitions definitions;
	
	@XmlElement(name="tests")
	private Tests tests;
	
	@XmlElement(name="objects")
	private Objects objects;
	
	@XmlElement(name="states")
	private States states;

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
	
	public Definitions getDefinitions(){
		return definitions;
	}
	
	public void setDefinitions(Definitions definitions){
		this.definitions = definitions;
	}
	
	public String toString(){
		return "This is the xml string";
	}

	public Tests getTests() {
		return tests;
	}

	public void setTests(Tests tests) {
		this.tests = tests;
	}

	public Objects getObjects() {
		return objects;
	}

	public void setObjects(Objects objects) {
		this.objects = objects;
	}

	public States getStates() {
		return states;
	}

	public void setStates(States states) {
		this.states = states;
	}
}
