package com.example.lab07_6.Repository;

import com.example.lab07_6.Entity.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
}