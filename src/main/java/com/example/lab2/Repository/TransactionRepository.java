package com.example.lab2.Repository;


import com.example.lab2.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    @Query(value="select * from transaction;",nativeQuery = true)
    List<Transaction> obtenerTransactions();

    @Query(value="select * from transaction WHERE tx_id= ?1",nativeQuery = true)
    List<Transaction> obtenerTransactionsxTxID(String tx_id);

}
