package com.example.lab2.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtransaction")
    private int id;
    @Column(name = "description")
    private String description;
    @Column(name = "tx_id")
    private String tx_id;
    @Column(name = "amount")
    private String amount;
    @Column(name = "neetwork_fee")
    private String neetwork_fee;
    @Column(name = "block")
    private String block;
    @Column(name = "status")
    private String status;
    @ManyToOne
    @JoinColumn(name="user_iduser")
    private User user;
    @ManyToOne
    @JoinColumn(name="wallet_from")
    private Wallet wallet;
    @Column(name = "currency")
    private String currency;

}
