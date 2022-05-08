package ru.kpfu.aminovniaz.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.kpfu.aminovniaz.model.Student;
import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, String> {
    Optional<Student> findStudentByEmail(String email);
}
