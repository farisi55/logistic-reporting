package com.example.logisticreporting.domain.controllers;

import com.example.logisticreporting.domain.service.TransationService;
import com.example.logisticreporting.model.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactions")
public class ReportController {

    @Autowired
    TransationService transationService;

    @GetMapping
    public Iterable<Transaction> findAll(){
        return transationService.findAll();
    }

}
