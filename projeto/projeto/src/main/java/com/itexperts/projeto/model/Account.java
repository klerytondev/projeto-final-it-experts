package com.itexperts.projeto.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "account")
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name_owner")
    private String nameOwner;

    @Column(name = "agency_code")
    private String agencyCode;

    @Column(name = "account_code")
    private String accountCode;

    @Column(name = "digit_verification")
    private String verificationDigit;


    //private List<Card> cards;

}
