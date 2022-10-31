package com.shanira.rentacar.repository;

import com.shanira.rentacar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Integer> {

}
