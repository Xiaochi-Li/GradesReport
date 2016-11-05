package com.example.android.gradesreport;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lixiaochi on 31/10/16.
 */

public class ReportCard {
    //student information
    private String studentName ;
    private int studentGrade;
    private int classNumber;
    //a dictionary of couses taken and the results.
    private Map<String, Integer> grades = new HashMap<String, Integer>();


    //constructor
    private ReportCard(String name,int grade,int classNum){
        studentName = name;
        studentGrade = grade;
        classNumber = classNum;
        grades = new HashMap<String, Integer>();
    }

    //get/set student name
    public void setStudentName(String name){
        studentName = name;
    }
    
    public String getStudentName(){
        return  studentName;
    }

    //get/set student grade
    public void setStudentGrade(int grade){
        studentGrade =grade;
    }
    
    public int getStudentGrade(){
        return studentGrade;
    }

    //get/set class
    public void setClassNumber(int classnum){
        classNumber=classnum;
    }
    
    public int getClassNumber(){
        return classNumber;
    }

    //get the subject and the correspond mark
    public Map getGrade(){
        return grades;
    }

    //add or update marks
    public void setGrades(String subject,Integer mark){
        grades.put(subject,mark);
    }

    //delete subject if a student drop a subject
    public void deleteSubject(String subject){
        grades.remove(subject);
    }


    //I'm using a toString method inside the tostring method.

    @Override
    public String toString() {
        String st = studentName + "\n"
                + "Class" + classNumber + " " + "Grade" +studentGrade +"\n";
        for (Map.Entry<String,Integer> entry: grades.entrySet()){
            String subPlusGrades= entry.getKey() + entry.getValue() + "\n";
            st += subPlusGrades;
        }
        return st;
    }


    
}
