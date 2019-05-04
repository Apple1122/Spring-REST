package jackson.json.demo;

import java.io.File;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		
		try {
			
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JOSN file and map/convert to Java POJO:
			// data/sample-lite.json
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			// print first name and last name
			System.out.println("First Name: " + theStudent.getFirstName());
			System.out.println("Last Name: " + theStudent.getLastName());
			
			// print out address: street and city
			System.out.println("Street: " + theStudent.getAddress().getStreet());
			System.out.println("City: " + theStudent.getAddress().getCity());
			
			// print out languages
			// https://www.geeksforgeeks.org/streams-arrays-java-8/
			Arrays.stream(theStudent.getLanguages()).forEach(System.out::println);
			
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
	}

}
