package com.example.tidexist.tidoper.service;

import org.springframework.stereotype.Component;

import com.example.tidexist.tidoper.entity.Student;

@Component
public interface StudentService {
    Student save(Student student);

    Student update(Student student);

    Student get(int id);

    void delete(Student student);
}