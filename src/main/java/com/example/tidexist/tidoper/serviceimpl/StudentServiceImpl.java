package com.example.tidexist.tidoper.serviceimpl;

import java.util.Optional;

import com.example.tidexist.tidoper.entity.Student;
import com.example.tidexist.tidoper.repository.StudentRepository;
import com.example.tidexist.tidoper.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("bookServiceImpl")
public class StudentServiceImpl implements StudentService {

    //@Autowired
    //private StudentRepository studentRepository;

    private StudentRepository studentRepository;
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional
    @CachePut(value = "student", key = "#student.id")
    public Student save(Student student) {
        //Student createResponse = studentRepository.save(student);
        //return createResponse;
        return studentRepository.save(student);
    }

    @Transactional
    @Cacheable(value = "student", key = "#id")
    public Student get(int id) {
        Student student;
        Optional<Student> studentResponse = studentRepository.findById(id);
        if (studentResponse.isPresent()) {
            student = studentResponse.get();
        } else {
            throw new RuntimeException("Record not found");
        }
        return student;
    }

    @Transactional
    @CachePut(value = "student", key = "#student.id")
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Transactional
    @CacheEvict(value = "student", key = "#student.id")
    public void delete(Student student) {
        studentRepository.delete(student);
    }
}