package ovalpackage;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Hive {
	@XmlAttribute(name="datatype")
	private String datatype;
	
	@XmlValue
	private String hive;

	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public String getHive() {
		return hive;
	}

	public void setHive(String hive) {
		this.hive = hive;
	}
	
	
}
