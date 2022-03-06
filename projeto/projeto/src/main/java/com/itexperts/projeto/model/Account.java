package com.itexperts.projeto.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "account")
@Data
@NoArgsConstructor
public class Account implements Serializable {

    private static final Long serialVersionUID = 1L;

    //TODO entender o implements serializable do JPA (especificação) / Hibernate (implementação padrão da espec. JPA)
    // serializable converte em bytes pra encaminhar/recuperar dados para o/do banco de dados

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

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Card> cards;


}
