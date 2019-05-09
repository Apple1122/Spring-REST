package springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> theStudents;
	
	// define @PostConstruct to load the students data ... only one
	@PostConstruct
	public void loadStudents()
	{
		theStudents = new ArrayList<>();
		
		theStudents.add(new Student("Poornima", "Patel"));
		theStudents.add(new Student("Mario", "Russi"));
		theStudents.add(new Student("Mary", "Smith"));
	}
	
	
	// define endpoint for "/student" - return list of students
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		return theStudents;	
	}
	
	// define endpoint for "/students/{studentId}" - return student at index
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId)
	{
		return theStudents.get(studentId);
	}
	
}
