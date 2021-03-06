package ovalpackage;

import javax.xml.bind.annotation.*;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Criteria {
	@XmlAttribute(name="operator")
	private String operator;
	
//	@XmlElement(name="criteria")
	private List<Criterion> criteria = new ArrayList<Criterion>();
	
	public void setOperator(String operator){
		this.operator = operator;
	}
	
	public String getOperator(){
		return operator;
	}
	
	public void setCriteria(List<Criterion> criteria){
		this.criteria = criteria;
	}
	
	public List<Criterion> getCriteria(){
		return criteria;
	}
}
