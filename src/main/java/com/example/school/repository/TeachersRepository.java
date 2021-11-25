package com.example.school.repository;


import com.example.school.entity.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeachersRepository extends JpaRepository<Teachers, Long> {

    Optional<Teachers> findTeachersByFirstName(String firstName);
}
