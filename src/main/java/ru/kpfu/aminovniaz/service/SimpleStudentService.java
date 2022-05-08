package ru.kpfu.aminovniaz.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kpfu.aminovniaz.model.Student;
import ru.kpfu.aminovniaz.repository.StudentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SimpleStudentService implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
