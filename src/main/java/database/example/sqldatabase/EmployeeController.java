package database.example.sqldatabase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/employee")
	public String getEmployeeDetail() {
		return "Employee is : Mark Hyden";
	}
}
