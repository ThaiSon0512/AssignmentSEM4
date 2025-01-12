package com.example.demo.jpaRepository.main;

import java.util.List;
import java.util.Optional;

public interface JpaExecutor <T> {
    List<T> findAll();
    Optional<T> findById(Number id);
}
