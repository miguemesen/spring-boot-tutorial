package com.tec.tutorial.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Miguel",
                        "miguemesen@hotmail.com",
                        LocalDate.of(2000, Month.APRIL,8),
                        21

                )
        );
    }
}
