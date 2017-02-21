package system_characteristic;

import javax.xml.bind.annotation.*;

import ovalpackage.Generator;

@XmlRootElement(name="oval_definitions")
@XmlAccessorType(XmlAccessType.FIELD)
public class OvalDefinitions {
	@XmlElement(name="system_data")
	private system_data sysdata;
	
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
	
	public system_data getsysdata(){
		return sysdata;
	}
	
	public void setSystemData(system_data sysdata){
		this.sysdata = sysdata;
	}
	
	
	
	

	
}
