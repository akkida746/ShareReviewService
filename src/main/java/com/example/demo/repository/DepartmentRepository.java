package com.example.demo.repository;

import com.example.demo.model.Department;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface DepartmentRepository extends ReactiveCrudRepository<Department,Integer> {
    Mono<Department> findByUserId(Integer userId);
}
