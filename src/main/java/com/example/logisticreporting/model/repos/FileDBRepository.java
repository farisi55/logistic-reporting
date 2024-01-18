package com.example.logisticreporting.model.repos;

import com.example.logisticreporting.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDBRepository extends JpaRepository<Transaction, String> {
}
