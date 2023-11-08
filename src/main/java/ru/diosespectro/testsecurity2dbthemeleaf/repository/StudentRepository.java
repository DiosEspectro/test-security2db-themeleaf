package ru.diosespectro.testsecurity2dbthemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.diosespectro.testsecurity2dbthemeleaf.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
