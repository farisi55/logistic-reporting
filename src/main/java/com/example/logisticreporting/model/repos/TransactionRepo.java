package com.example.logisticreporting.model.repos;


import com.example.logisticreporting.model.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepo extends CrudRepository<Transaction, Long> {
}
