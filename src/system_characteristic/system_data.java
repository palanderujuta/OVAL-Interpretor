package system_characteristic;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

//import ovalpackage.Definition;
@XmlAccessorType(XmlAccessType.FIELD)
public class system_data {
	
	@XmlElement(name="file_item")
	private List<fileitem> filelistnew=new ArrayList<fileitem>();

	public List<fileitem> getFilelistnew() {
		return filelistnew;
	}

	public void setFilelistnew(List<fileitem> filelistnew) {
		this.filelistnew = filelistnew;
	}
	
	

}
