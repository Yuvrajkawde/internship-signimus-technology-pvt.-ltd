package com.signimus.Student.Managment.repositories;

import com.signimus.Student.Managment.entity.Studentt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Studentt, Long> {

}
