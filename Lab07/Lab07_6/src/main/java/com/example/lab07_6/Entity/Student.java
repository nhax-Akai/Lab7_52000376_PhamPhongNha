package com.example.lab07_6.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter @Getter
@Entity
public class Student {
    @Id
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Double ielts;

    public Student(Long id,String name,Integer age,String email,Double ielts) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.ielts = ielts;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", ielts=" + ielts +
                '}';
    }

}
