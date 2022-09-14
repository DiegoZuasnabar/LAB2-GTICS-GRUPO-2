package com.example.lab2.Repository;

import com.example.lab2.Entity.Transaction;
import com.example.lab2.Entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Integer> {
}
