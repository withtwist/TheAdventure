package se.chalmers.kangaroo.model;

import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Map {
	
	private int[][] map;
	
	public <T> T unmarshal( Class<T> docClass, InputStream inputStream )
		    throws JAXBException {
		    String classPackage = docClass.getPackage().getName();
		    JAXBContext jc = JAXBContext.newInstance(classPackage);
		    Unmarshaller u = jc.createUnmarshaller();
		    JAXBElement<T> element = (JAXBElement<T>)u.unmarshal( inputStream );
		    return element.getValue();
		}

}
