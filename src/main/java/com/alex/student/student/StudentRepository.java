package com.alex.student.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("Select s from Student s Where s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
