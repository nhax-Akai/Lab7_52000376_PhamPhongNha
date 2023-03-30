package com.example.lab07_6;

import com.example.lab07_6.Entity.Student;
import com.example.lab07_6.Repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
@SpringBootApplication
public class Lab076Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab076Application.class, args);
    }
    @Bean
    public CommandLineRunner demo(StudentRepository repository) {
        return (args) -> {
            // Read the list of students, sorted in descending order by age and ascending order by ielts scores
            Sort sort = Sort.by(Sort.Order.desc("age"), Sort.Order.asc("ielts"));
            Iterable<Student> students = repository.findAll(sort);
            System.out.println("List of students sorted by age (descending) and ielts scores (ascending):");
            students.forEach(System.out::println);

            // Function to read students 4-5-6 and print them to the console
            printStudents(repository, 3, 3);
        };
    }

    private void printStudents(StudentRepository repository, int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Page<Student> page = repository.findAll(pageable);
        System.out.println("Students 4-5-6:");
        page.getContent().forEach(System.out::println);
    }
}

