package com.signimus.Student.Managment.repositories;

import com.signimus.Student.Managment.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}
