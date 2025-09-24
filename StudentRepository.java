package com.signimus.Student.Managment.repositories;

import com.signimus.Student.Managment.entity.Studentt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Studentt, Long> {
    public Studentt findByEmail(String email);

    @Query(value = "SELECT * FROM Students WHERE(:name IS NULL OR name = :name) AND (:age IS NULL OR age = :age)",nativeQuery = true)
    public List<Studentt> findByNameAndAge(@Param("name") String name, @Param("age") int age);

}
