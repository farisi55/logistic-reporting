package com.example.logisticreporting.domain.service;

import com.example.logisticreporting.model.entity.Transaction;
import com.example.logisticreporting.model.repos.FileDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

@Service
public class FileStorageService {

    @Autowired
    private FileDBRepository fileDBRepository;
    public Transaction store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Transaction FileDB = new Transaction(fileName, file.getContentType(), file.getBytes());
        return fileDBRepository.save(FileDB);
    }
    public Transaction getFile(String id) {
        return fileDBRepository.findById(id).get();
    }

    public Stream<Transaction> getAllFiles() {
        return fileDBRepository.findAll().stream();
    }

}
