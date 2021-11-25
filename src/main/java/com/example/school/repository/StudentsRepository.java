package com.example.school.repository;

import com.example.school.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {

    Optional<Students> findStudentsByFirstName(String firstName);
}
