package com.itexperts.projeto.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.itexperts.projeto.enums.Flag;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "card")
@Data
@NoArgsConstructor
public class Card implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "flag")
    @Enumerated(EnumType.STRING)
    private Flag flag;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_type_id", referencedColumnName = "id", unique = true, foreignKey = @ForeignKey(name = "fk_card_type"))
    private CardType cardType;

    //TODO deixar numero unico
    @Column(name = "number")
    private String number;

    @Column(name = "digit_code")
    private String digitCode;

    @Column(name = "limit_balance")
    private Double limitBalance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_card_account"))
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Account account;

}
