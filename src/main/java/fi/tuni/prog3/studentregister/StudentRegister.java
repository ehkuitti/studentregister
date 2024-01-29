/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fi.tuni.prog3.studentregister;

import fi.tuni.prog3.studentregister.Course;
import fi.tuni.prog3.studentregister.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author eetu
 */

public class StudentRegister
{
    ArrayList<Student> students;
    ArrayList<Course> courses;

    /*public int compareTo(Student other) {
        // Compare based on student numbers
        return this.studentNumber.compareTo(other.studentNumber);
    }*/

    public StudentRegister()
    {
    }

    //public int compareTo(Student other) {
        //return this.students.compareTo(other.students);
    //}

    public ArrayList<Student> getStudents()
    {
        //ArrayList<Student> tempListStudent = new ArrayList<>();
        students.sort(Comparator.comparing(Student::getName));
        return students;

    }

    public ArrayList<Course> getCourses()
    {
        return courses;
    }

    public void addStudent(Student student)
    {

    }

    public void addCourse(Course course)
    {

    }

    public void addAttainment(Attainment att)
    {

    }

    public void printStudentAttainments(String studentNumber, String order)
    {

    }

    public void printStudentAttainments(String studentNumber)
    {

    }


    public static void main(String[] args)
    {

    }
}
