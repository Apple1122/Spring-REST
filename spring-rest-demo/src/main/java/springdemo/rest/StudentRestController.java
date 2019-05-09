package springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	// define endpoint for "/student" - return list of students
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		List<Student> theStudents = new ArrayList<>();
		
		theStudents.add(new Student("Poornima", "Patel"));
		theStudents.add(new Student("Mario", "Russi"));
		theStudents.add(new Student("Mary", "Smith"));
		
		return theStudents;	
	}
}
