package com.example.logisticreporting.domain.service;

import com.example.logisticreporting.model.entity.Transaction;
import com.example.logisticreporting.model.repos.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TransationService {

    @Autowired
    TransactionRepo transactionRepo;

    public Iterable<Transaction> findAll(){
        return transactionRepo.findAll();
    }

}
