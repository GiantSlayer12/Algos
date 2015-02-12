import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class StudentJava {

	
	public static void main(String[] args) {
	
		try {
			File file = new File("file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Student student = (Student)unmarshaller.unmarshal(file);
			System.out.println(student.toString());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
