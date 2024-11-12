//package com.springlearn.StudentDetails;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class homePageController {
//
//    @Autowired
//    StudentDetails std;
//
//    @Autowired
//    ClassRepo repo;
//
//
//    @RequestMapping("/index")
//    public String Home(){
//        System.out.println("Home called ....");
//        return "index";
//    }
//
//
//    @RequestMapping("/Success")
//    public String success(@RequestParam("studentName") String name, @RequestParam("id") int id,
//                    @RequestParam("dob") String date){
//        System.out.println(name+"|"+ id +"|"+date);
//
//        std.setId(id);
//        std.setStudentName(name);
//        std.setDob(date);
//
//        repo.save(std);
//        return "Success";
//    }
//
//    @RequestMapping("delete")
//    public String delete(@RequestParam("id1") int id){
//        repo.deleteById(id);
//        return "delete";
//    }
//
//    @RequestMapping("show/{id}")
//    public ResponseEntity<StudentDetails> showDetails(@PathVariable("id") int id){
//        StudentDetails std = repo.findById(id).get();
//        return new ResponseEntity<>(std, HttpStatus.ACCEPTED);
//    }
//
//
//
//}
