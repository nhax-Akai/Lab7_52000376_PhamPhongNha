package com.example.lab07_3.Model;

import com.example.lab07_3.Entity.Student;

public interface StudentService {
    public Iterable<Student> getAllStudents();
    public Student getStudent(long id)throws Exception;
    public void deleteStudent(long id);
    public Student save(Student student);
}
