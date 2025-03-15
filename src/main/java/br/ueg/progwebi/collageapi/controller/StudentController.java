package br.ueg.progwebi.collageapi.controller;

import br.ueg.progwebi.collageapi.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/student")

public class StudentController {

    @GetMapping
    public List<Student> listAll() {

        Student student = new Student();
        student.setId(1L);
        student.setName("Estudante 1");
        student.setRegisterNumber("1234567890");
        student.setCourse("SI");
        student.setRegisterDate(LocalDate.now());

        Student student2 = Student.builder()
                .id(2L)
                .name("Estudante 2")
                .registerNumber("987654321")
                .course("SI")
                .registerDate(LocalDate.now())
                .build();

        Student student3 = Student.builder()
                .id(3L)
                .name("Estudante 3")
                .registerNumber("436542")
                .course("SI")
                .registerDate(LocalDate.now())
                .build();

        List<Student> students =Arrays.asList(student, student2, student3);

        return students;

    }
}
