package com.example.lab07_3.Repository;

import com.example.lab07_3.Entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
