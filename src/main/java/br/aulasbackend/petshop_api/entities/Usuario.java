package br.aulasbackend.petshop_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome_de_usuario", nullable = false, unique = true)
    private String nomeDeUsuario;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "primeiro_nome", nullable = false)
    private String primeiroNome;

    @Column(name = "ultimo_nome", nullable = false)
    private String ultimoNome;
}