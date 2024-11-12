package com.springlearn.StudentDetails.controller;

import com.springlearn.StudentDetails.model.DeletedEmployee;
import com.springlearn.StudentDetails.repo.DeletedEmployeeRepository;
import com.springlearn.StudentDetails.model.EmployeeDetails;
import com.springlearn.StudentDetails.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class empController {

    @Autowired
    EmployeeRepository empRepo;

    @Autowired
    DeletedEmployeeRepository delRepo;
//
//    @PostMapping
//    public ResponseEntity<EmployeeDetails> add(@RequestBody EmployeeDetails emp){
//
//       EmployeeDetails empDetails = empRepo.save(emp);
//        return ResponseEntity.ok(empDetails);
//    }

    @RequestMapping({"/index","/"})
    public String home(){
        return "index";
    }

    @RequestMapping("/Success")
    public String add(@RequestParam("id") int id, @RequestParam("name") String name,
                      @RequestParam("age") int age,@RequestParam("salary") int salary){

        EmployeeDetails emp = new EmployeeDetails();

        emp.setId(id);
        emp.setName(name);
        emp.setAge(age);
        emp.setSalary(salary);

        System.out.println("page called");

        empRepo.save(emp);

        return "Success";
    }

    @RequestMapping("delete")
    public String softDelete(@RequestParam("id1") int id){

        Optional<EmployeeDetails> empOpt = empRepo.findById(id);

        if(empOpt.isPresent()){
            EmployeeDetails emp = empOpt.get();

            DeletedEmployee demp = new DeletedEmployee();

            demp.setId(emp.getId());
            demp.setName(emp.getName());
            demp.setAge(emp.getAge());
            demp.setSalary(emp.getSalary());

            delRepo.save(demp);

            empRepo.deleteById(id);


            System.out.println("Document Archived");

        }
        else {
            System.out.println("Id not found");
        }

        return "delete";
    }

}
