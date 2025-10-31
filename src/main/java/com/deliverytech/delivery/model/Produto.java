package com.deliverytech.delivery.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private BigDecimal preco;

    @ManyToOne
    @JoinColumn(name="restaurante_id")
    private Restaurante restaurante;

}
