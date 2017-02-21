package ovalpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import system_characteristic.mainClass;

public class ResMain {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		
		ResultOvalDef res=new ResultOvalDef();
		Results r=new Results();
		List<Definitions> defList=new ArrayList<Definitions>();
		Definitions d=new Definitions();
		defList.add(d);
		List<Definition> definitions=new ArrayList<Definition>();
		d.setDefinitions(definitions);
		Definition d1=new Definition();
		definitions.add(d1);
		
		//JAXBApp j=new JAXBApp();
		//mainClass m=new mainClass();
		
		
		if(JAXBApp.sendValue().equals(mainClass.sendValue()))
			d1.setResult(true);
		else
			d1.setResult(false);
		
		//d1.setResult(true);
		d1.setId("oval:mil.disa.fso.windows:def:3695");
		d1.setVersion("5");
		r.setDefi(defList);
		res.setResults(r);
		JAXBContext jaxbContext = JAXBContext.newInstance( ResultOvalDef.class );
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );
		jaxbMarshaller.marshal( res, new File( "simple.xml" ) );
		jaxbMarshaller.marshal( res, System.out );


	}

}
