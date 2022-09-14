package com.example.lab2.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter

@Table(name = "wallet_has_currency")
public class WalletHasCurrency  {
    @EmbeddedId
    private whc_Id id;

    @MapsId("wallet_idwallet")
    @ManyToOne
    @JoinColumn(name = "wallet_idwallet")
    private Wallet walletIdwallet;

    @Column(name = "purchase_price")
    private Double purchasePrice;

    @Column(name = "amount")
    private Double amount;

    @MapsId("wallet_idcurrency")
    @ManyToOne
    @Column(name = "currency_idcurrency")

    private Currency currencyIdcurrency;





}