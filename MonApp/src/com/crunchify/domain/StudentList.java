package com.crunchify.domain;

import java.util.List;

//import javax.xml.bind.annotation.XmlRootElement;


public class StudentList {

 private List<Student> studentList;

 protected StudentList() {
 }

 public StudentList(List<Student> studentList) {
  this.studentList = studentList;
 }


 public List<Student> getStudentList() {
  return studentList;
 }
}

//package com.crunchify.domain;
//
//import java.util.List;
//
//import javax.xml.bind.annotation.XmlRootElement;
//
//@XmlRootElement(name = "student-list")
//public class StudentList {
//
// private List<Student> studentList;
//
// protected StudentList() {
// }
//
// public StudentList(List<Student> studentList) {
//  this.studentList = studentList;
// }
//
// @javax.xml.bind.annotation.XmlElement(name = "student")
// public List<Student> getStudentList() {
//  return studentList;
// }
//}