package com.itexperts.projeto.model;

import com.itexperts.projeto.enums.CardTypeEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "type")
@Data
@NoArgsConstructor
public class CardType implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", unique = true)
    @Enumerated(EnumType.STRING)
    private CardTypeEnum name;

}
