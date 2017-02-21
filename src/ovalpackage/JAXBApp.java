package ovalpackage;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBApp extends OvalDefinitions {
	
	static String DEF_FILE = "src/ovalpackage/definitions.xml";

	public static void main(String[] args) throws Exception{
		//objectToXML();
		XMLtoObject();
	}

	private static void objectToXML() throws Exception {
		JAXBContext jc = JAXBContext.newInstance("ovalpackage");
		OvalDefinitions od = populate();
		Marshaller m = jc.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(od, System.out);
	}
	
	private static OvalDefinitions populate(){
		OvalDefinitions od = new OvalDefinitions();
		od.setXmlns("This is the xmlns string.");
		od.setXmlnsOval("This is the xmlns:oval string.");
		od.setXmlnsXsi("This is the xmlns:xsi string.");
		od.setXsiSchemaLocation("This is the xsi:schemaLocation string.");
		
		Generator g = new Generator();
		g.setProductName("PRODUCTNAME");
		g.setSchemaVersion("SCHEMAVERSION");
		g.setTimestamp("TIMESTAMP");
		od.setGenerator(g);
		
		Metadata m1 = new Metadata();
		Metadata m2 = new Metadata();
		
		m1.setTitle("M1TITLE");
		m1.setDescription("M1DESCRIPTION");
		
		m2.setTitle("M2TITLE");
		m2.setDescription("M2DESCRIPTION");
		
		
		Reference r = new Reference();
		
		r.setSource("SOURCE");
		r.setRefId("REFID");
		r.setRefUrl("REFURL");
		
		m1.getReferences().add(r);
		m1.getReferences().add(r);
		
		m2.getReferences().add(r);
		m2.getReferences().add(r);
		
		Affected a = new Affected();
		
		a.setFamily("FAMILY");
		a.setPlatform("PLATFORM");
		
		m1.setAffected(a);
		m2.setAffected(a);
		
		Criteria c = new Criteria();
		
		Criterion c1 = new Criterion();
		Criterion c2 = new Criterion();
		
		c1.setTestRef("TESTREF1");
		c1.setComment("COMMENT1");
		c1.setNegate("FALSE1");
		c2.setTestRef("TESTREF2");
		c2.setComment("COMMENT2");
		c2.setNegate("FALSE2");
		
		c.getCriteria().add(c1);
		c.getCriteria().add(c2);
		
		
		Definitions d = new Definitions();
		Definition d1 = new Definition();
		Definition d2 = new Definition();
		
		d1.setId("ID1");
		d1.setVersion("VERSION1");
		d1.setClasstype("CLASS1");
		d1.setMetadata(m1);
		d1.setCriteria(c);
		
		d2.setId("ID2");
		d2.setVersion("VERSION2");
		d2.setClasstype("CLASS2");
		d2.setMetadata(m1);
		d2.setCriteria(c);
		
		d.getDefinitions().add(d1);
		d.getDefinitions().add(d2);
		od.setDefinitions(d);
		
		RegistryTest rt1 = new RegistryTest();
		RegistryTest rt2 = new RegistryTest();
		State s1 = new State();
		State s2 = new State();
		Obj o1 = new Obj();
		Obj o2 = new Obj();
		
		s1.setStateRef("STATEREF1");
		s2.setStateRef("STATEREF2");
		o1.setObjectRef("OBJREF1");
		o2.setObjectRef("OBJREF2");
		
		rt1.setXmlns("XMLNS1");
		rt1.setId("ID1");
		rt1.setVersion("VERSION1");
		rt1.setComment("COMMENT1");
		rt1.setCheckExistence("CHECKEXISTENCE1");
		rt1.setCheck("CHECK1");
		rt1.setObj(o1);
		rt1.setState(s1);
		rt2.setXmlns("XMLNS2");
		rt2.setId("ID2");
		rt2.setVersion("VERSION2");
		rt2.setComment("COMMENT2");
		rt2.setCheckExistence("CHECKEXISTENCE2");
		rt2.setCheck("CHECK2");
		rt2.setObj(o2);
		rt2.setState(s2);
		
		Tests t = new Tests();
		t.getRegistryTests().add(rt1);
		t.getRegistryTests().add(rt2);
		od.setTests(t);
		
		RegistryObject ro = new RegistryObject();
		ro.setXmlns("XMLNS");
		ro.setId("ID");
		ro.setVersion("VERSION");
		
		Hive h = new Hive();
		Key k = new Key();
		Name n = new Name();
		
		h.setDatatype("DATATYPE");
		k.setDatatype("DATATYPE");
		n.setDatatype("DATATYPE");
		
		h.setHive("HIVE");
		k.setKey("KEY");
		n.setName("NAME");
		
		ro.setHive(h);
		ro.setKey(k);
		ro.setName(n);
		
		Objects o = new Objects();
		o.getRegistryObjects().add(ro);
		o.getRegistryObjects().add(ro);
		od.setObjects(o);
		
		RegistryState rs = new RegistryState();
		rs.setXmlns("XMLNS");
		rs.setId("ID");
		rs.setVersion("VERSION");
		rs.setComment("COMMENT");
		rs.setType("TYPE");
		
		Value v = new Value();
		v.setDatatype("DATATYPE");
		v.setOperation("OPERATION");
		v.setValue("VALUE");
		rs.setValue(v);
		
		States s = new States();
		s.getRegistryStates().add(rs);
		s.getRegistryStates().add(rs);
		od.setStates(s);
		
		return od;
	}
	
	private static void XMLtoObject() throws Exception {
		/*JAXBContext jc = JAXBContext.newInstance("ovalpackage");
		Unmarshaller u = jc.createUnmarshaller();
        OvalDefinitions od = (OvalDefinitions)u.unmarshal( ClassLoader.getSystemResourceAsStream("ovalpackage/ovaldefs.xml") );
        RegistryState s = new RegistryState();
        s = od.getStates().getRegistryStates().get(0);
        System.out.println(s.getValue().getValue());*/
		
			// TODO Auto-generated method stub
				File file = new File(DEF_FILE);
				JAXBContext jaxbContext = JAXBContext.newInstance(OvalDefinitions.class);
				javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				OvalDefinitions ovaldefinitions = (OvalDefinitions)  jaxbUnmarshaller.unmarshal(file);
				//System.out.println("\n"+ovaldefinitions.getStates().getRegistryStates());
				System.out.println("Value: " + ovaldefinitions.getStates().getRegistryStates().get(0).getValue().getValue());
				//sendValue(ovaldefinitions.getStates().getRegistryStates().get(0).getValue().getValue());
			
		
	}
	
	
	public static String sendValue() throws JAXBException
	{
		File file = new File(DEF_FILE);
		JAXBContext jaxbContext = JAXBContext.newInstance(OvalDefinitions.class);
		javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		OvalDefinitions ovaldefinitions = (OvalDefinitions)  jaxbUnmarshaller.unmarshal(file);
		//System.out.println("\n"+ovaldefinitions.getStates().getRegistryStates());
		System.out.println("Value: " + ovaldefinitions.getStates().getRegistryStates().get(0).getValue().getValue());
		return ovaldefinitions.getStates().getRegistryStates().get(0).getValue().getValue();
		//return str;
	}
}
