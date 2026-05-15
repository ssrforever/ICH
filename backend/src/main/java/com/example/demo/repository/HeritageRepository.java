package com.example.demo.repository;

import com.example.demo.model.Heritage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeritageRepository extends JpaRepository<Heritage, Long> {
    // 继承后，自动拥有 save(), findAll(), findById() 等功能
}