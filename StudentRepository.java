package com.signimus.Student.Managment.repositories;

import com.signimus.Student.Managment.entity.Studentt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Studentt, Long> {
    public Studentt findByEmail(String email);

    @Query(value = "SELECT * FROM Students WHERE(:name IS NULL OR name = :name) AND (:age IS NULL OR age = :age)",nativeQuery = true)
    public List<Studentt> findByNameAndAge(@Param("name") String name, @Param("age") int age);

    //    Native query
    @Query(value="SELECT * FROM Students WHERE age >= :studentAge", nativeQuery = true)
    public Optional<List<Studentt>> getStudentListByAge(@Param("studentAge") int age);

    //    JPQL query
    @Query("SELECT s FROM Studentt s WHERE s.age >= :age")// jpql works with entity name while native works with database table name
    public Optional<List<Studentt>> getStudentListByAge1(@Param("age") int age);

    public Page<Studentt> findAll(Pageable pageable);

    @Query("SELECT s FROM Studentt s WHERE s.age >= :stdAge ")
    public Page<Studentt> findStudentGreaterThanAge(@Param("stdAge") int age, Pageable pageable);

}
