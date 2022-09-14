package com.example.lab2.Repository;

import com.example.lab2.Entity.WalletHasCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.lab2.Entity.whc_Id;

@Repository
public interface WalletXCurrencyRepository extends JpaRepository<whc_Id,WalletHasCurrency> {


}
