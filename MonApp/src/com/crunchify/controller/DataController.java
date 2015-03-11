package com.crunchify.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crunchify.domain.Student;
import com.crunchify.domain.StudentList;

@Controller
public class DataController {

 @RequestMapping("/student")
 public @ResponseBody
 Student getStudent() {
	 
	 System.out.println("test1");
 return new Student(23, "Meghna", "Naidu", "meghna@gmail.com",
  "8978767878");
	 
	 
 }

 @RequestMapping("/studentlist")
 public @ResponseBody
 StudentList getStudentList() {
	 System.out.println("test1");
  List<Student> studentList = new ArrayList<Student>();
  studentList.add(new Student(3, "Robert", "Parera", "robert@gmail.com",
    "8978767878"));
  studentList.add(new Student(93, "Andrew", "Strauss",
    "andrew@gmail.com", "8978767878"));
  studentList.add(new Student(239, "Eddy", "Knight", "knight@gmail.com",
    "7978767878"));

  return new StudentList(studentList);
 }

}
