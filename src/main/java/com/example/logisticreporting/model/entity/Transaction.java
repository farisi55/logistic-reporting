package com.example.logisticreporting.model.entity;

import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "tbl_transaction")
public class Transaction implements Serializable {

    private static final long  serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;

    @Lob
    private byte[] data;
    public Transaction() {
    }

    public Transaction(String name, String type, byte[] data) {
        this.name = name;
        this.type = type;
        this.data = data;
    }

    @NotEmpty(message =  "status is require")
    @Column(name = "status_transaksi")
    private Integer statusTransaction;

    @Column(name = "deskripsi", length = 100)
    private String description;

    @Column(name = "id_transaksi_request", length = 50)
    private String trasactionIdRequest;


}
