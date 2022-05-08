package ru.kpfu.aminovniaz.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kpfu.aminovniaz.model.Student;
import ru.kpfu.aminovniaz.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> fetchAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }
}
