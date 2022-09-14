package com.example.lab2.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.io.Serializable;
@Getter
@Setter

public class whc_Id  implements Serializable {
    @Column(name = "wallet_idwallet",nullable = false)
    private  Integer wallet_idwallet;

    @Column(name = "wallet_idcurrency",nullable = false)
    private  Integer wallet_idcurrency;
}
