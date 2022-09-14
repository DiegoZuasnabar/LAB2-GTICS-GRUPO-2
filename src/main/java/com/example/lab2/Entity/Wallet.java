package com.example.lab2.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="wallet")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idwallet")
    private int id;
    @Column(name = "address")
    private String address;
    @ManyToOne
    @JoinColumn(name = "user_iduser")
    private User user_iduser;
    @Column(name = "total_usd")
    private int total_usd;
}
