//package com.springlearn.StudentDetails;
//
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//@Component
//@Entity
//@Scope("prototype")
//public class StudentDetails {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private int Id;
//    private String StudentName;
//    private String dob;
//
//    public int getId() {
//        return Id;
//    }
//
//    public void setId(int id) {
//        Id = id;
//    }
//
//    public String getStudentName() {
//        return StudentName;
//    }
//
//    public void setStudentName(String studentName) {
//        StudentName = studentName;
//    }
//
//    public String getDob() {
//        return dob;
//    }
//
//    public void setDob(String dob) {
//        this.dob = dob;
//    }
//
//    @Override
//    public String toString() {
//        return "StudentDetails{" +
//                "Id=" + Id +
//                ", StudentName='" + StudentName + '\'' +
//                ", dob='" + dob + '\'' +
//                '}';
//    }
//}
