package br.com.engineering.themes.spring.payroll;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // This annotation make the class responsible to make the business logic and access the REST methods
public class EmployeeController {


    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository repository) {
        this.employeeRepository = repository;
    }

    // This annotation access the endpoint which I pass on the url and make the get method (return something)
    @GetMapping("/employee")
    List<Employee> listAll() {
        return employeeRepository.findAll();
    }

    // This annotation makes the method responsible to post our request.
    // I can make a post giving an argument in the body or in the url
    @PostMapping
    Employee newEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/employee/{id}")
    Employee listOne(@PathVariable Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException());
    }

    // This annotation make possible to delete something passing an argument in the url or in the body
    @DeleteMapping("/employee/{id}")
    void removeEmployee(@PathVariable Long id) {

        System.out.println("Employee " + employeeRepository.findById(id) + " was removed");
        employeeRepository.deleteById(id);
    }

}
