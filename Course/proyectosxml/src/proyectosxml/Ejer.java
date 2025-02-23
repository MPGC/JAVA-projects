package proyectosxml;

import java.io.File;
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;
import java.util.Iterator;
import java.util.List;  
  
import org.jdom2. *;
import org.jdom2.input.SAXBuilder;
  
 public class Ejer { 
	 public static void main(String[] args) {
		 SAXBuilder builder = new SAXBuilder(); 
		 File xmlFile = new File("file.xml");
		 try { 
			 Document document = (Document) builder.build(xmlFile);
//construimos �rbol JDOM a partir del fichero xml
			 Element rootNode = document.getRootElement();
			 List list = rootNode.getChildren("empleado");
			
				 Iterator<Element> it= list.iterator();
				 while(it.hasNext()) {
					 Element node = (Element) it.next(); 
				 System.out.println("Primer Apellido : " + node.getChildText("apellido1"));
				 System.out.println("Segundo Apellido : " + node.getChildText("apellido2"));
				 System.out.println("Nombre : " + node.getChildText("nombre"));
				 System.out.println("Salario : " + node.getChildText("salario")); 
				 }
				 
			 } catch (IOException io) { System.out.println(io.getMessage()); 
			 } catch (JDOMException jdomex) { System.out.println(jdomex.getMessage()); } 
		 } 
	 }
