package com.example.crud.repository;

import com.example.crud.entity.CrudEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudOperationRepository extends JpaRepository<CrudEntity,Integer> {
}
