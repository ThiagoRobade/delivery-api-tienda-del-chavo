package com.deliverytech.delivery.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String categoria;

    @OneToMany(mappedBy = "restaurante")
    private List<Produto> produtos;
}
