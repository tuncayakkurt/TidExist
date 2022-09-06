package com.example.tidexist.tidoper.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.tidexist.tidoper.entity.Student;


@Repository
public interface StudentRepository extends CrudRepository<Student,Serializable> {

}