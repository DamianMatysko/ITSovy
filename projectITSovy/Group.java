package sk.itsovy.matysko.projectITSovy;

import sk.itsovy.matysko.projectITSovy.Student;
import java.util.Date;
import java.util.Calendar;
import java.util.Random;


public class Group {
    private String name;
    private Student arr[];
    private int capacity;
    private int size;

    public Group(String name, int capacity) {
        this.name = name;
        this.arr = new Student[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public boolean addStudent(Student student){
        if (student==null || size==capacity){
            return  false;
        }
        arr[size]=student;
        size++;
        return true;

    }

    public Student getStudent(String firstName,String lastName){
        return null;
    }
    public boolean deleteStudent(Student student){
        if (student == null || size == 0)
            return false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == student) {
                // TODO delete
            }
        }
        return true;
    }
    public void print(){
        System.out.println("list of students["+name+"] : ");
        for (int i=0;i<size;i++){
            System.out.println("  "+arr[i].toString());
        }
    }

    public void sort(boolean cond) { //TODO
        /*
        if (cond) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < arr.length; i++){
                    if (){
                        Student temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            print();
        }
        */
        int n = size;

        if (size > 0) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i].getLastName().compareToIgnoreCase(arr[j].getLastName()) > 0) {
                        Student temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    if (arr[i].getLastName().compareToIgnoreCase(arr[j].getLastName()) == 0) {
                        if (arr[i].getFirstName().compareToIgnoreCase(arr[j].getFirstName()) > 0) {
                            Student temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
            }
        }
    }


    public Student randomStudent(){//TODO
        int a = 0;
        if (size > 0) {
            Random rn = new Random();

            a = rn.nextInt(size);

        }
        return arr[a];
    }
    public int getStudMonth(Student student) {//TODO
        return 1;
    }




}
