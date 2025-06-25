package com.example.demo.repository;

import com.example.demo.entity.FormData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<FormData,Integer> {
}