/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author gurkarancheema
 */
import java.util.*;
public class Student
{
  
  
  public static void main (String [] args)
  {
    StudentList[] newStudent = new Student[100];
    Scanner sc = new Scanner(System.in);
    Scanner sd = new Scanner(System.in);

   for(int i=0; i<newStudent.length; i++)
    {
          Student newEnter = new Student();
    
    System.out.println("Please Enter Student Name");
    String studentName = sc.nextLine();
    newEnter.setName(studentName);
    
    System.out.println("Please Enter Student ID");
    int studentId = sd.nextInt();
    newEnter.setId(studentId);
    
    System.out.println("Please Enter Student Program");
    String studentProgram = sc.nextLine();
    newEnter.setProgram(studentProgram);
    
    
    
    newStudent[i] = newEnter;
    
    System.out.println("Student Name: " + newEnter.getName());
    System.out.println("Student ID: " + newEnter.getId());
    System.out.println("Student Program: " + newEnter.getProgram());
    
   }
    
  }
  
