package com.example.lab07_6.Model;

import com.example.lab07_6.Entity.Student;

public interface StudentService {
    public Iterable<Student> getAllStudents();
    public Student getStudent(long id)throws Exception;
    public void deleteStudent(long id);
    public Student save(Student student);
}
