package br.aulasbackend.petshop_api.entities;

import jakarta.persistence.*;

@Entity
public class UsuarioEntidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
}
