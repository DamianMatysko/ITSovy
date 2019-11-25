package sk.itsovy.matysko.projectITSovy;

import java.lang.System;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private Date birthdate;
    private String[] subjects;
    private int caunrtOfSubjects;


    public Student(String firstName, String lastName, Date birthdate, String[] subjects, int caunrtOfSubjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.subjects = subjects;
        this.caunrtOfSubjects = caunrtOfSubjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



    public Date getBirthdate() {
        return birthdate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }



    public String toString(){
        return firstName+" "+ lastName;

    }



    public void setDate(String day, String moth, Student year){


    }

    public boolean addSubject(String subject){
        if (subject==null||subject==""){
            return false;
        }
        boolean find=false;
        for (int i=0;i<caunrtOfSubjects;i++){
            if (subjects[i].compareToIgnoreCase(subject)==0){
                find=true;
                break;
            }
            if (find==false && caunrtOfSubjects<10){
                subjects[caunrtOfSubjects]=subject.toUpperCase();
                caunrtOfSubjects++;
                return true;
            }else{
                return false;
            }


        }
        return false;
    }
    public void printSubjects(){
        System.out.println("Student "+firstName+" "+lastName+"att:");
        for (int i=0;i<caunrtOfSubjects;i++){
            System.out.println(" -"+subjects[i]);
        }
    }
}
